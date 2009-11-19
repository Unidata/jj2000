/*
 * CVS identifier:
 *
 * $Id: JJ2KEncoder.java,v 1.10 2001/10/26 12:31:43 grosbois Exp $
 *
 * Class:                   JJ2KEncoder
 *
 * Description:             Wrapper for the CmdLnEncoder class.
 *
 *
 *
 * COPYRIGHT:
 * 
 * This software module was originally developed by Raphaël Grosbois and
 * Diego Santa Cruz (Swiss Federal Institute of Technology-EPFL); Joel
 * Askelöf (Ericsson Radio Systems AB); and Bertrand Berthelot, David
 * Bouchard, Félix Henry, Gerard Mozelle and Patrice Onno (Canon Research
 * Centre France S.A) in the course of development of the JPEG2000
 * standard as specified by ISO/IEC 15444 (JPEG 2000 Standard). This
 * software module is an implementation of a part of the JPEG 2000
 * Standard. Swiss Federal Institute of Technology-EPFL, Ericsson Radio
 * Systems AB and Canon Research Centre France S.A (collectively JJ2000
 * Partners) agree not to assert against ISO/IEC and users of the JPEG
 * 2000 Standard (Users) any of their rights under the copyright, not
 * including other intellectual property rights, for this software module
 * with respect to the usage by ISO/IEC and Users of this software module
 * or modifications thereof for use in hardware or software products
 * claiming conformance to the JPEG 2000 Standard. Those intending to use
 * this software module in hardware or software products are advised that
 * their use may infringe existing patents. The original developers of
 * this software module, JJ2000 Partners and ISO/IEC assume no liability
 * for use of this software module or modifications thereof. No license
 * or right to this software module is granted for non JPEG 2000 Standard
 * conforming products. JJ2000 Partners have full right to use this
 * software module for his/her own purpose, assign or donate this
 * software module to any third party and to inhibit third parties from
 * using this software module for non JPEG 2000 Standard conforming
 * products. This copyright notice must be included in all copies or
 * derivative works of this software module.
 * 
 * Copyright (c) 1999/2000 JJ2000 Partners.
 * */

import jj2000.j2k.encoder.*;

/**
 * This class is a wrapper for the CmdLnEncoder class in the
 * jj2000.j2k.encoder package. It is used to avoid having to list the whole
 * package hierarchy in the java virtual machine command line.
 * */
public class JJ2KEncoder {

    /**
     * The starting point of the program. It forwards the call to the
     * CmdLnEncoder class.
     *
     * @param argv The command line arguments.
     * */
    public static void main(String argv[]) {
        if (argv.length == 0) {
            System.err.println("JJ2KEncoder: JJ2000's JPEG 2000 Encoder\n");
            System.err.println("    use JJ2KEncoder -u to get help\n");
            System.exit(1);
        }

        CmdLnEncoder.main(argv);
    }
}
