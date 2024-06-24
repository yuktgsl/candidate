package es.catapult.interview.candidates.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.catapult.interview.candidates.model.UserDao;
import es.catapult.interview.candidates.services.CandidateService;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class CandidateController {

    private final CandidateService candidateService;

    @GetMapping("all")
    private ResponseEntity<List<UserDao>> getAllUsers() {
    	log.info("Getting all users");
    	List<UserDao> userDaos = candidateService.getAll();
    	return ResponseEntity.ok(userDaos);
    }

    @GetMapping("/fetch/{id}")
    private ResponseEntity<UserDao> fetchUser(@Min(1) @PathVariable("id") Long id) {
    	log.info("Getting user [{}]",id);
    	return ResponseEntity.ok(candidateService.get(id));
    }

}
