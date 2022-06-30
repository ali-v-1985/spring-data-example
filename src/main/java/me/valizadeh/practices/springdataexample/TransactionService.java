package me.valizadeh.practices.springdataexample;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository<Transaction> transactionRepository;

    public Page<Transaction> all(String userName) {
        PageRequest pageRequest = getPageRequest();
        Specification<Transaction> specification = getSpecification(userName);
        return transactionRepository.findAll(specification, pageRequest);
    }

    public Specification<Transaction> getSpecification(String userName) {

        return Specification.where(
            (Specification<Transaction>) (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("userName"),
                userName));
    }

    private PageRequest getPageRequest() {
        int page = 0;
        return PageRequest.of(page, 100, Sort.unsorted());
    }
}
