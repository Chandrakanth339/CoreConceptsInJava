package com.chandrakanth.hashequals;

public class HashCodeEquals {

	
	private boolean primitiveBool;
	private String name;
	private Integer objectInt;
	private Long objectLong;
	private Boolean objectBool;
	private Double objectDouble;
	private double primitiveDouble;
	private int primitiveInt;
	private long primitiveLong;
	private Float objectFloat;
	private float primitiveFloat;
	public Integer getObjectInt() {
		return objectInt;
	}

	public void setObjectInt(Integer objectInt) {
		this.objectInt = objectInt;
	}

	public Long getObjectLong() {
		return objectLong;
	}

	public void setObjectLong(Long objectLong) {
		this.objectLong = objectLong;
	}

	public Boolean getObjectBool() {
		return objectBool;
	}

	public void setObjectBool(Boolean objectBool) {
		this.objectBool = objectBool;
	}

	public Double getObjectDouble() {
		return objectDouble;
	}

	public void setObjectDouble(Double objectDouble) {
		this.objectDouble = objectDouble;
	}

	public double getPrimitiveDouble() {
		return primitiveDouble;
	}

	public void setPrimitiveDouble(double primitiveDouble) {
		this.primitiveDouble = primitiveDouble;
	}

	public int getPrimitiveInt() {
		return primitiveInt;
	}

	public void setPrimitiveInt(int primitiveInt) {
		this.primitiveInt = primitiveInt;
	}

	public long getPrimitiveLong() {
		return primitiveLong;
	}

	public void setPrimitiveLong(long primitiveLong) {
		this.primitiveLong = primitiveLong;
	}

	public Float getObjectFloat() {
		return objectFloat;
	}

	public void setObjectFloat(Float objectFloat) {
		this.objectFloat = objectFloat;
	}

	public float getPrimitiveFloat() {
		return primitiveFloat;
	}

	public void setPrimitiveFloat(float primitiveFloat) {
		this.primitiveFloat = primitiveFloat;
	}

	


	public HashCodeEquals() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((hashEq == null) ? 0 : hashEq.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((objectBool == null) ? 0 : objectBool.hashCode());
		result = prime * result + ((objectDouble == null) ? 0 : objectDouble.hashCode());
		result = prime * result + ((objectFloat == null) ? 0 : objectFloat.hashCode());
		result = prime * result + ((objectInt == null) ? 0 : objectInt.hashCode());
		result = prime * result + ((objectLong == null) ? 0 : objectLong.hashCode());
		result = prime * result + (primitiveBool ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(primitiveDouble);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(primitiveFloat);
		result = prime * result + primitiveInt;
		result = prime * result + (int) (primitiveLong ^ (primitiveLong >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeEquals other = (HashCodeEquals) obj;
/*		if (hashEq == null) {
			if (other.hashEq != null)
				return false;
		} else if (!hashEq.equals(other.hashEq))
			return false;*/
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (objectBool == null) {
			if (other.objectBool != null)
				return false;
		} else if (!objectBool.equals(other.objectBool))
			return false;
		if (objectDouble == null) {
			if (other.objectDouble != null)
				return false;
		} else if (!objectDouble.equals(other.objectDouble))
			return false;
		if (objectFloat == null) {
			if (other.objectFloat != null)
				return false;
		} else if (!objectFloat.equals(other.objectFloat))
			return false;
		if (objectInt == null) {
			if (other.objectInt != null)
				return false;
		} else if (!objectInt.equals(other.objectInt))
			return false;
		if (objectLong == null) {
			if (other.objectLong != null)
				return false;
		} else if (!objectLong.equals(other.objectLong))
			return false;
		if (primitiveBool != other.primitiveBool)
			return false;
		if (Double.doubleToLongBits(primitiveDouble) != Double.doubleToLongBits(other.primitiveDouble))
			return false;
		if (Float.floatToIntBits(primitiveFloat) != Float.floatToIntBits(other.primitiveFloat))
			return false;
		if (primitiveInt != other.primitiveInt)
			return false;
		if (primitiveLong != other.primitiveLong)
			return false;
		return true;
	}

	public Long getL() {
		return objectLong;
	}

	public void setL(Long objectLong) {
		this.objectLong = objectLong;
	}


	public boolean isPrimitiveBool() {
		return primitiveBool;
	}

	public void setPrimitiveBool(boolean primitiveBool) {
		this.primitiveBool = primitiveBool;
	}
}
