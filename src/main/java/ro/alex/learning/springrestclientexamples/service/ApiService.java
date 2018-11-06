package ro.alex.learning.springrestclientexamples.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ro.alex.learning.api.domain.User;

import java.util.List;

@Service
public interface ApiService {
    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);

}
