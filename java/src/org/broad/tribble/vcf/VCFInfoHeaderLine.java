package org.broad.tribble.vcf;


/**
 * @author ebanks
 *         <p/>
 *         Class VCFInfoHeaderLine
 *         <p/>
 *         A class representing a key=value entry for INFO fields in the VCF header
 */
public class VCFInfoHeaderLine extends VCFCompoundHeaderLine {

    public VCFInfoHeaderLine(String name, int count, VCFHeaderLineType type, String description, VCFHeaderVersion version) {
        super(name, count, type, description, SupportedHeaderLineType.INFO, version);
    }

    public VCFInfoHeaderLine(String name, int count, VCFHeaderLineType type, String description) {
        super(name, count, type, description, SupportedHeaderLineType.INFO);
    }

    protected VCFInfoHeaderLine(String line, VCFHeaderVersion version) {
        super(line, version, SupportedHeaderLineType.INFO);
    }

    // info fields allow flag values
    @Override
    boolean allowFlagValues() {
        return true;
    }
}