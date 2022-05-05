package Actors;

import java.util.LinkedList;

import Threads.JobBank;

public class UserRequest {
    public int current_level;
    public int destination_level;

    public UserRequest(int current_level, int destination_level) {
        this.current_level = current_level;
        this.destination_level = destination_level;
    }

    public int getDirection()
    {
        if(destination_level > current_level){
            return 1;
        }
        return -1;
    }

    public void CreateJob(UserRequest r)
    {
        LinkedList<UserRequest> list = JobBank.getJobQueue();
        list.add(r);
        JobBank.setJobQueue(list);
    }
}
