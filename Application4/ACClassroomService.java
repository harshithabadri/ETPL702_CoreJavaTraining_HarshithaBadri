package com.evergent.corejava.harshitha.application4;

public class ACClassroomService implements Service {
	// Concrete classes for specific services
	    @Override
	    public String getName() {
	        return "AC Classroom";
	    }
	    @Override
	    public int getCost() {
	        return 10000;
	    }
	}
	class WeekendTestService implements Service {
	    @Override
	    public String getName() {
	        return "Weekend Tests";
	    }
	    @Override
	    public int getCost() {
	        return 5000;
	    }
	}
	class FoodService implements Service {
	    @Override
	    public String getName() {
	        return "Food";
	    }
	    @Override
	    public int getCost() {
	        return 2000;
	    }
	}
