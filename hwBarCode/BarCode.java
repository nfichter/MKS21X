public boolean equals(Object other) {
    return (this == other) || ((other instanceof BarCode) && ((BarCode)other._zip.equals( _zip)));
}

public class BarCode implements Comparable {
    private String _zip;
    private int _checkDigit;
    
    public BarCode(String zip) {
        _zip = zip;
	_checkDigit = 0;
	for (int i = 0; i < 5; i++) {
	    _checkDigit.add(Integer.parseInt(zip.substring(i,i+1)));
	}
	_checkDigit %= 10;
    }
    public BarCode(BarCode x) {
	_zip = x._zip;
	_checkDigit = x._checkDigit;
    }

    private int checkSum() {
	int check = 0;
    }

    public String toString() {
	
    }
}