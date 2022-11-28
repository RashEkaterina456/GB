package lesson1.Competitors;

public class Team {
    String teamName;
    lesson1.Competitors.Competitor[] teamMembers = new lesson1.Competitors.Competitor[4];


    public Team(String teamName, lesson1.Competitors.Competitor[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){

        return "Team name: "+teamName;
    }

    public lesson1.Competitors.Competitor[] getMembers(){

        return teamMembers;
    }

    public void showResults(){
        for(lesson1.Competitors.Competitor c: teamMembers){
            c.showResult();
        }
    }

    public void showMembersFinishedCourse(){
        for(lesson1.Competitors.Competitor c: teamMembers){
            if(c.isOnDistance())
                c.showResult();
        }
    }
}
