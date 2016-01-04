public class BarCode implements Comparable {
    private String _zip;
    private int _checkDigit;
    
    public BarCode(String zip) {
        _zip = zip;
	_checkDigit = checkSum();
    }
    public BarCode(BarCode x) {
	_zip = x._zip;
	_checkDigit = x._checkDigit;
    }

    private int checkSum() {
	int zip = Integer.parseInt(_zip);
	int ret = 0;
	while (zip != 0) {
	    ret += zip % 10;
	    zip /= 10;
	}
	ret %= 10;
	return ret;
    }

    public static final String[] codes = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    public String toString() {
	String ret = "";
	for (int i = 0; i < _zip.length(); i++) {
	    ret += codes[Integer.parseInt(_zip.substring(i,i+1))];
	}
	return ret;
    }

    public boolean eqauls(Object o) {
	return (this == o) || ((o instanceof BarCode) && (((BarCode)o)._zip.equals( _zip)));
    }

    public int compareTo(Object o) {
	return Integer.parseInt(_zip)-Integer.parseInt(((BarCode)o)._zip);
    }
}