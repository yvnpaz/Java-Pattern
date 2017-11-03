package caldo;

public abstract class CookFood {

	IProcess iProcess;
	String name;
	
	public IProcess getIProcess()
	{
		return this.iProcess;
	}
	
	public void setIProcess(IProcess iprocess)
	{
		this.iProcess = iprocess;
	}
	
	// M�todo a implementar por las clases que hereden
    public abstract void obtain();
	
}
