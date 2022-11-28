package lesson1.obstacles;

import lesson1.Competitors.Competitor;
import lesson1.Competitors.Team;

public class Course {

    lesson1.obstacles.Obstacle[] obstacles;

    public Course(lesson1.obstacles.Obstacle[] obstacles){

        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Competitor[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Competitor c: teamMembers){
                for (lesson1.obstacles.Obstacle o: obstacles){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
}
