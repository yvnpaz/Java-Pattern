package caldoMasEnvasado;

public abstract class CookFood {

	IProcess iprocess;
	
	public IProcess getIProcess()
	{
		return this.iprocess;
	}
	
	public void setIProcess(IProcess iprocess)
	{
		this.iprocess = iprocess;
	}
	
	public abstract void obtain();
}
