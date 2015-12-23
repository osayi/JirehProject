package com.appvillage.osayi.jireh;

import android.location.GpsStatus;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Date;

public class sp_activity extends AppCompatActivity {

    private String userName;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private GpsStatus location;
    private String verificationId;
    private int phoneNumber;
    private int numberOfCancellations;
    private int bankInfo;         //acc number, swift no, bank id etc
    private String email;
    private int averageRating;
    private ArrayList servicesProviding; //get from service ClassID
    private ArrayList reviewsOn;      // get from service class userReview

    public void createService;   //serviceType, serviceLocation, schedule)
    public void enterAvailability; //spSchedule
    public GpsStatus locateUser;
    public void createProfile;
    public void editProfile;
    public void specifyAvailabilityRadius;
    public int makeComplaints;
    public void makeCommentOnUser;
    public void specifyPreferenceToUser; //

    //userName
    public void setUserName (String userName){
        return userName
    }

    public String getUserName() {
        return userName;
    }

    //firstName


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //lastName


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //dateofBirth

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //GPS location

    public GpsStatus getLocation() {
        return location;
    }

    public void setLocation(GpsStatus location) {
        this.location = location;
    }

    //verification

    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    //phoneNumber

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // number of Cancellations

    public int getNumberOfCancellations() {
        return numberOfCancellations;
    }

    public void setNumberOfCancellations(int numberOfCancellations) {
        this.numberOfCancellations = numberOfCancellations;
    }

    //bankInfo

    public int getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(int bankInfo) {
        this.bankInfo = bankInfo;
    }

    //email

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //SP average rating

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    //Service being provided

    public ArrayList getServicesProviding() {
        return servicesProviding;
    }

    public void setServicesProviding(ArrayList servicesProviding) {
        this.servicesProviding = servicesProviding;
    }

    //reviews

    public ArrayList getReviewsOn() {
        return reviewsOn;
    }

    public void setReviewsOn(ArrayList reviewsOn) {
        this.reviewsOn = reviewsOn;
    }

    /* methods*/

    //createService
    public void getCreateService() {
        return createService;
    }

    public void setCreateService(void createService) {
        this.createService = createService;
    }

    //Availability
    public void getEnterAvailability() {
        return enterAvailability;
    }

    public void setEnterAvailability(void enterAvailability) {
        this.enterAvailability = enterAvailability;
    }

    //userLocater method
    public GpsStatus getLocateUser() {
        return locateUser;
    }

    public void setLocateUser(GpsStatus locateUser) {
        this.locateUser = locateUser;
    }

    //createProfile method
    public void getCreateProfile() {
        return createProfile;
    }

    public void setCreateProfile(void createProfile) {
        this.createProfile = createProfile;
    }

    //edit profile method
    public void getEditProfile() {
        return editProfile;
    }

    public void setEditProfile(void editProfile) {
        this.editProfile = editProfile;
    }

    //availability radius
    public void getSpecifyAvailabilityRadius() {
        return specifyAvailabilityRadius;
    }

    public void setSpecifyAvailabilityRadius(void specifyAvailabilityRadius) {
        this.specifyAvailabilityRadius = specifyAvailabilityRadius;
    }

    //Complaints form
    public int getMakeComplaints() {
        return makeComplaints;
    }

    public void setMakeComplaints(int makeComplaints) {
        this.makeComplaints = makeComplaints;
    }

    // access comments
    public void getMakeCommentOnUser() {
        return makeCommentOnUser;
    }

    public void setMakeCommentOnUser(void makeCommentOnUser) {
        this.makeCommentOnUser = makeCommentOnUser;
    }

    //userPreference
    public void getSpecifyPreferenceToUser() {
        return specifyPreferenceToUser;
    }

    public void setSpecifyPreferenceToUser(void specifyPreferenceToUser) {
        this.specifyPreferenceToUser = specifyPreferenceToUser;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spro_interact);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sp_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
