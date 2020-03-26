package com.sopromadze.blogapi.controller;

import com.sopromadze.blogapi.payload.ReportRequest;
import com.sopromadze.blogapi.payload.ReportResponse;
import com.sopromadze.blogapi.security.CurrentUser;
import com.sopromadze.blogapi.security.UserPrincipal;
import com.sopromadze.blogapi.service.PostService;
import com.sopromadze.blogapi.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


    @RestController
    @RequestMapping("/api/report")
    public class ReportController {
        @Autowired
        private ReportService reportService;
        @PostMapping
        @PreAuthorize("hasRole('USER')")
        public ResponseEntity<ReportResponse> addReport( @RequestBody ReportRequest reportRequest,
                                                        @CurrentUser UserPrincipal currentUser) {
            System.out.println(reportRequest);
            ReportResponse reportResponse = reportService.addReport(reportRequest, currentUser);

		        return new ResponseEntity<ReportResponse>(reportResponse, HttpStatus.CREATED);
        }
    }
