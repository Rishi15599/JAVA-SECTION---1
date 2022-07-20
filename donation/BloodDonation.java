package donation;
public class BloodDonation {
    public String donor_name = "";
    public Integer donor_age = 0;
    public float donor_weight = 0.0f;
    //Constructor here
    public BloodDonation(String name,int age,float weight){
        donor_name = name;
        donor_age =  age;
        donor_weight = weight;
    }
    public String getDonorData(){
        return "Your Data here"+ " " + this.donor_name + " " + this.donor_age + " " + this.donor_weight;

    }
    public String toString()
	{
		return this.donor_name + " " + this.donor_age + " " + this.donor_weight;
	}
}