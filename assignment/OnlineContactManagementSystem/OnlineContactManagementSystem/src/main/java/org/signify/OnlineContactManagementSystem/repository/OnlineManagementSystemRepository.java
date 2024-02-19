package org.signify.OnlineContactManagementSystem.repository;

import org.signify.OnlineContactManagementSystem.entity.OnlineManagementSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineManagementSystemRepository extends JpaRepository<OnlineManagementSystem,Long> {
}
