package com.social.social_media.socialAccount;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<SocialMediaAccount, Long> {
    List<SocialMediaAccount> findByUserId(Long userId);
}
