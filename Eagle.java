public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    /**
     * Eagle get off in the sky
     */
    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s take off in the sky.%n", this.getName());
    }
    }
    /**
     * fly updown
     * @param altitude increase
     * @return altitude
     */
    @Override
    public int ascend(int metersAlt) {
    	if(this.flying) {
    		this.altitude=Math.min(this.altitude+metersAlt, 355);
    		System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
    	}
    	return this.altitude;
    }
    /**
     * glides into the air.
     */
    @Override
    public void glide() {
    	if(this.flying) {
    		System.out.println("glides into the air.");
    	}
    }
    /**
     * flies downward
     * @param altitude decrease
     * @return altitude
     */
    @Override
    public int descend(int metersAlt) {
    	if(this.flying) {
    		this.altitude = Math.max(this.altitude-metersAlt,0);
    		System.out.printf("%s flies downward, altitude: %d%n", this.getName(), this.altitude);
    	}
    	return this.altitude;
    }
    /**
     * altitude is too high, lands on the ground
     */
    @Override
    public void land() {
    	if(this.flying && this.altitude == 1) {
            System.out.printf("%s lands on the ground.%n", this.getName());

    	}else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());

    	}
    }
    
}
