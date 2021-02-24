package com.db.hack.trainingportal.constant;

public class UserQueries {

    private  UserQueries(){}
    public static final String USER_LOGIN=" select * from Temp_DB.user_details where user_details.email :email AND user_details.password :password";
}
