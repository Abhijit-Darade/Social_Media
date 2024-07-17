package com.social.social_media.analytics;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
    Analytics findBySocialAccountId(Long accountId);
}
