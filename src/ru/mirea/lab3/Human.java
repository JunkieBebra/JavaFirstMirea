package ru.mirea.lab3;

public class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;
    private Body body;
    public Human(Character headSize, Character handSize, Character legSize, Character bodySize){
        this.head = new Head(headSize);
        this.body = new Body(bodySize);
        this.leftHand = new Hand(handSize);
        this.rightHand = new Hand(handSize);
        this.leftLeg = new Leg(legSize);
        this.rightLeg = new Leg(legSize);
    }

    @Override
    public String toString() {
        return head.getSize() + " " + leftLeg.getSize() + " " + leftHand.getSize() + " " + body.getSize();
    }
}
