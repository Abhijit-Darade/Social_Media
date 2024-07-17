package com.social.social_media.analytics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/analytics")
@RequiredArgsConstructor
public class AnalyticsController {
    private final AnalyticsRepository analyticsRepository;

    @GetMapping("/{accountId}")
    public ResponseEntity<Analytics> findById(@PathVariable Long accountId){
        Analytics analytics = analyticsRepository.findBySocialAccountId(accountId);
        return ResponseEntity.ok(analytics);
    }
}
