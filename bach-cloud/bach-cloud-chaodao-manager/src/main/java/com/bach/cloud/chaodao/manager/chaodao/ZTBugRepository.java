package com.bach.cloud.chaodao.manager.chaodao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZTBugRepository extends CrudRepository<ZTBug, Integer> {
    List<ZTBug> findZTBugByTitle(String title);
    List<ZTBug> findZTBugByTitleAndStatus(String title, String status);
    List<ZTBug> findZTBugByStatus(String status);
}
