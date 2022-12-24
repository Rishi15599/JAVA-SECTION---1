import donation.BloodDonation;

public class BloodDonor {
       public static void main(String[] args) {
      BloodDonation donor1 =new BloodDonation("rishi",12,35.5f);
      BloodDonation donor2 =new BloodDonation("rishi2",12,35.5f);
      BloodDonation donor3 =new BloodDonation("rishi3",12,35.5f);

      System.out.println(donor1.getDonorData());
      System.out.println(donor2); 
      System.out.println(donor3);

    }

    
}
