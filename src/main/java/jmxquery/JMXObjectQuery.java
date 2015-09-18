package jmxquery;

public class JMXObjectQuery
{
	private String object;
	private String attributeName;
	private String attributeKey;
	private String methodName;

	public JMXObjectQuery(final String object, final String attributeName, final String attributeKey)
	{
		this.object = object;
		this.attributeName = attributeName;
		this.attributeKey = attributeKey;
	}

	public JMXObjectQuery(final String object, final String methodName)
	{
		this.object = object;
		this.methodName = methodName;
	}

	public JMXObjectQuery()
	{
	}

	public String getObject()
       	{
		return object;
	}

	public void setObject(final String value)
	{
		this.object = value;
	}	

	public String getAttributeName()
       	{
		return attributeName;
	}

	public void setAttributeName(final String value)
	{
		this.attributeName = value; 
	}

	public String getAttributeKey()
       	{
		return attributeKey;
	}

	public void setAttributeKey(final String value)
	{
		this.attributeKey = value;
	}

	public boolean hasAttributeKey() 
	{
		return this.attributeKey != null;
	}

	public String getMethodName() 
	{
		return methodName;
	}

	public void setMethodName(final String value)
       	{
		this.methodName = value;
	}

	public boolean isAttributeQuery() 
	{
		return this.attributeName != null;
	}

	public String toString()
       	{
		if (this.isAttributeQuery()) {
			return String.format("%s.%s", object, attributeName) + (hasAttributeKey()? ("." + attributeKey) : "");
		}

		return String.format("%s.%s()", object, methodName); 
	}
}

