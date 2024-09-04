package com.evergent.corejava.harshitha.application4;

public abstract class CourseImpl implements Course {
	    protected String name;
	    protected int cost;
	    public CourseImpl(String name, int cost) {
	        this.name = name;
	        this.cost = cost;
	    }
	    @Override
	    public String getName() {
	        return name;
	    }
	    @Override
	    public int getCost() {
	        return cost;
	    }
	    // Default implementation for discount (can be overridden in subclasses)
	    @Override
	    public double applyDiscount(double cgpa) {
	        return cost; // No discount by default
	    }
	}
	// Concrete classes for specific courses
	class GateCourse extends CourseImpl {
	    public GateCourse() {
	        super("GATE", 56000);
	    }
	    @Override
	    public double applyDiscount(double cgpa) {
	        if (cgpa >= 8.0) {
	            return cost * 0.8; // 20% discount
	        }
	        return cost;
	    }
	}
	class MBAcourse extends CourseImpl {
	    public MBAcourse() {
	        super("MBA", 150000);
	    }
	}
	class AEEcourse extends CourseImpl {
	    public AEEcourse() {
	        super("Assistant Executive Engineer", 50000);
	    }
	}
	class SoftwareCourse extends CourseImpl {
	    public SoftwareCourse() {
	        super("Software", 30000);
	    }
	}
