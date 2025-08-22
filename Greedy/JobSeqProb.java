// Job Sequencing Problem
// Given a array of jobs where each job has a deadline and profit,
// if the job is completed before the deadline.
// It is also given that every job takes 1 unit of time.
// so the minimum possible deadline for any job is 1.
// Ṃaximize the total profit if only one job can be scheduled at a time.
// Job A = 4,20
// Job B = 1,10
// Job C = 1,40
// Job D = 1,30
// // Ans = 60 (Job A & Job C)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class JobSeqProb {
    public static class Job {
        int deadline;
        int profit;
        int idx;

        public Job(int idx, int deadline, int profit) {
            this.idx = idx;
            this.deadline = deadline;
            this.profit = profit;
        }

    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobList = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobList.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobList, (obj1, obj2) -> (obj2.profit - obj1.profit));

        ArrayList<Integer> seuence = new ArrayList<>();

        int time = 0;

        for (int i = 0; i < jobList.size(); i++) {
            Job curr = jobList.get(i);
            if (curr.deadline > time) {
                time++;
                seuence.add(curr.idx);
            }
        }

        System.out.println("Jobs  : " + time);
        System.out.println("Job sequence : " + seuence);
    }
}
