package com.swiftGo.techCRUD.SwiftGoCRUD;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.swiftGo.techCRUD.SwiftGoCRUD.Database.NewSwift;


@Repository
public interface NewSwiftInterface extends MongoRepository<NewSwift, Integer> {

	Optional<NewSwift> findByName(Integer Id);
}
