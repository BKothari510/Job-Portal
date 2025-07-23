package com.bhrugu.JobApp.service;

import com.bhrugu.JobApp.model.JobPost;
import com.bhrugu.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.JobName;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getALLJobs(){
        return repo.getALLJobs();
    }

    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
