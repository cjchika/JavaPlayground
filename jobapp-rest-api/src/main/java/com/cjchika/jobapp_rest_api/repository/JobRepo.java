package com.cjchika.jobapp_rest_api.repository;

import com.cjchika.jobapp_rest_api.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    JobPost findById(int jobId);

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfileKeyword, String postDescKeyword);
}


//
//@Repository
//public class JobRepo extends JpaRepository {
//
//
//
//    List<JobPost> jobs = new ArrayList<>();
//
//    public JobRepo(){
//        // Java Developer Job Post
//        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//        // Frontend Developer Job Post
//        jobs.add(
//                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//                        3, List.of("HTML", "CSS", "JavaScript", "React")));
//
//        // Data Scientist Job Post
//        jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                List.of("Python", "Machine Learning", "Data Analysis")));
//
//        // Network Engineer Job Post
//        jobs.add(new JobPost(4, "Network Engineer",
//                "Design and implement computer networks for efficient data communication", 5,
//                List.of("Networking", "Cisco", "Routing", "Switching")));
//
//        // Mobile App Developer Job Post
//        jobs
//                .add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
//                        3, List.of("iOS Development", "Android Development", "Mobile App", "Cloud")));
//
//    }
//
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addJob(JobPost job){
//        jobs.add(job);
//    }
//
//    public JobPost getJob(int jobId) {
//        for(JobPost job : jobs){
//            if(job.getPostId() == jobId){
//                return job;
//            }
//        }
//        return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for(JobPost jobPost1 : jobs){
//            if(jobPost1.getPostId() == jobPost.getPostId()){
//                jobPost1.setPostProfile(jobPost.getPostProfile());
//                jobPost1.setPostDesc(jobPost.getPostDesc());
//                jobPost1.setPostTechStack(jobPost.getPostTechStack());
//                jobPost1.setReqExperience(jobPost.getReqExperience());
//            }
//        }
//    }
//
//    public void deleteJob(int jobId){
//        for (JobPost jobPost1 : jobs){
//            if(jobPost1.getPostId() == jobId){
//                jobs.remove(jobPost1);
//            }
//        }
//    }
//}
