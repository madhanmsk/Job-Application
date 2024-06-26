package com.Application.Job.Application.Repository;

import com.Application.Job.Application.Model.Application;
import com.Application.Job.Application.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComapanyRepository extends JpaRepository<Company, Long> {

}
