package objectOrientation.UltraEmojiCombat;

public class Fight {

    private Fighter challenger;
    private Fighter challenged;
    private boolean approved;
    private boolean scheduled;

    public Fight(Fighter challenger, Fighter challenged){

        this.setChallenger(challenger);
        this.setChallenged(challenged);
        this.setApproved();
        if(this.isApproved()){
            this.schedule();
        } else {
            throw new Error("Cannot schedule fight!");
        }

    } 

    private void schedule(){
        this.scheduled = true;
        System.out.println("Schedulled succefully");
    }

    private void makeFight(){
        if(this.scheduled){
            System.out.println("Fight!!!!!");
        } else {
            System.out.println("Fight is not schedulled");
        }
    }

    public Fighter getChallenger() {
        return challenger;
    }
    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }
    public Fighter getChallenged() {
        return challenged;
    }
    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }
    public void setApproved() {
        if(this.challenger == null || this.challenged == null) this.approved = false;
        else if(this.challenged == this.challenger) this.approved = false;
        else if(this.challenged.getCategory() != this.challenger.getCategory()) this.approved = false;
        else this.approved = true;
    }
    public boolean isApproved(){
        return this.approved;
    }


    
}
