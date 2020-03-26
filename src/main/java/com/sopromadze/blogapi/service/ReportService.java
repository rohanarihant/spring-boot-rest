package com.sopromadze.blogapi.service;

import com.sopromadze.blogapi.model.post.Post;
import com.sopromadze.blogapi.payload.ApiResponse;
import com.sopromadze.blogapi.payload.PagedResponse;
import com.sopromadze.blogapi.payload.ReportRequest;
import com.sopromadze.blogapi.payload.ReportResponse;
import com.sopromadze.blogapi.security.UserPrincipal;

public abstract class ReportService {

//    PagedResponse<Post> getAllPosts(int page, int size);



//    Post updatePost(Long id, PostRequest newPostRequest, UserPrincipal currentUser);

//    ApiResponse deletePost(Long id, UserPrincipal currentUser);

    public abstract ReportResponse addReport(ReportRequest reportRequest, UserPrincipal currentUser);

//    Post getPost(Long id);

}
