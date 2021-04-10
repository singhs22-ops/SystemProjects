import { useCallback, useState, useRef } from "preact/hooks";

function checkValid({ element, validators = [] }, setErrors, errorClass) {
  return async () => {
    element.setCustomValidity("");
    element.checkValidity();
    let message = element.validationMessage;
    if (!message) {
      for (const validator of validators) {
        const text = await validator(element);
        if (text) {
          element.setCustomValidity(text);
          break;
        }
      }
      message = element.validationMessage;
    }
    if (message) {
      errorClass && element.classList.toggle(errorClass, true);
      setErrors(e => ({ ...e, [element.name]: message }));
    }
  };
}

export function useForm({ errorClass }) {
  const [errors, setErrors] = useState({}),
    fields = useRef({});

  const validate = useCallback(
    (validators = []) => {
      return ref => {
        let config;
        fields.current[ref.name] = config = { element: ref, validators };
        ref.onblur = checkValid(config, setErrors, errorClass);
        ref.oninput = () => {
          setErrors(e => {
            const { [ref.name]: removed, ...others } = e;
            return others;
          });
          errorClass && ref.classList.toggle(errorClass, false);
          ref.oninput = undefined;
        };
      };
    },
    [errorClass]
  );

  const handleSubmit = useCallback(
    (callback = () => {}) => {
      return ref => {
        ref.setAttribute("novalidate", "");
        ref.onsubmit = async e => {
          e.preventDefault();
          let errored = false;

          for (const k in fields.current) {
            const field = fields.current[k];
            await checkValid(field, setErrors, errorClass)();
            if (!errored && field.element.validationMessage) {
              field.element.focus();
              errored = true;
            }
          }
          !errored && callback(ref);
        };
      };
    },
    [errorClass]
  );

  return { validate, handleSubmit, errors };
}
