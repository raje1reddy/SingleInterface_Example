interface Interviewer {
     default Object submitInterviewstatus(){
         System.out.println("Accept");
         return null;

    }
    public abstract int interviewConducted();

} class manager implements Interviewer {
    //@Override
    public int interviewConducted() {
        return 0;
    }
}
