package com.ezen.gomgome.repository;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ezen.gomgome.entity.Notice;

@Transactional
public interface NoticeRepository extends JpaRepository<Notice, Integer>{
	
	Page<Notice> findByNoticeTitleContaining(String searchKeyword, Pageable pageable);
	Page<Notice> findByNoticeContentContaining(String searchKeyword, Pageable pageable);
	Page<Notice> findByNoticeTitleContainingOrNoticeContentContaining(String searchKeyword1, String searchKeyword2, Pageable pageable);

	
}
