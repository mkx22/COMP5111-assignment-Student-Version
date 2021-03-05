package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", true, 51, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", 23, 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 43, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        float[] floatArray2 = new float[] { 10L, (-19) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, -19.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-452), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!", pattern1, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r" + "'", str3, "hi!hi!\r");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-72), (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        float[] floatArray2 = new float[] { 10.0f, (short) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\r", "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        short[] shortArray4 = new short[] { (short) 0, (short) 0, (byte) 100, (byte) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass7 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 0, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "\n", "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!" + "'", str3, "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true, 43, (java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", 63, 22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-45), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 103, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 400);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double[] doubleArray1 = new double[] { 787 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[787.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 401 + "'", int3 == 401);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (-45), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-14), 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", false, 3, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-2), 21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int[] intArray4 = new int[] { (byte) 0, '\000', (short) 10, 'a' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 10, 97]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 27, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double[] doubleArray4 = new double[] { (-1.0d), 27, (-24), (-195) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 27.0, -24.0, -195.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r" + "'", str3, "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass15 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n ", 873, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", (-19), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\r", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! " + "'", str3, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", (java.lang.CharSequence) "\r", 787);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 439 + "'", int3 == 439);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 182 + "'", int3 == 182);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "hi!hi!hi!\r", 452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", pattern1, "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!" + "'", str3, "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 16, 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 491);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 122, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true, 0, (java.lang.CharSequence) "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", 22, 122);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", pattern1, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n " + "'", str3, "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n \n \n \n\n \n \n ", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r", "\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 494);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 453 + "'", int1 == 453);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-45), (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", true, 0, charSequence3, 30, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r,  , h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!?hi!??hi!hi!?hi!hi!?hi!hi! hi!hi!?hi!hi!?hi!hi!?? ?h?i?!?h?i?!???h?i?!?h?i?!? ?h?i?!?h?i?!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 393, 183);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n\r\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", false, 88, (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (int) '\000', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!" + "'", str3, "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n" + "'", str3, "\r\r\n");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 446 + "'", int3 == 446);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r,  , h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 494);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-90) + "'", int3 == (-90));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) (short) -1, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) (short) 100, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass8 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\r\r", (-393));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass16 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) '\r', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!\nhi!hi! hi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 7, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! " + "'", str3, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 439);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", 90, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 22, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n \n \n \n\n \n \n ", "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rh\ri\r!\r\r\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 491 + "'", int3 == 491);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\r", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 0, 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\n", true, 122, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 45, 393);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r", pattern1, "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r" + "'", str3, "\n\r\r");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !]");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!" + "'", str3, "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 72, (-452));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!hi!", "\n", "\r", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 23, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 99, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        long[] longArray3 = new long[] { (-1L), (short) -1, (-6) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass11 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, -1, -6]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", false, (int) (short) 10, (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 43, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (int) (byte) 0, (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 456 + "'", int3 == 456);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\n", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", 1, (-195));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true, (int) (byte) 0, (java.lang.CharSequence) "", 22, 873);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "\r\n \n \n \n\n \n \n ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        boolean[] booleanArray6 = new boolean[] { false, true, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (int) (short) 100, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-72), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r", (-6), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-452), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n \n \n \n\n \n \n ", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "\r", "", "", "" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n" + "'", str3, "\r\r\n");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 122);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-72), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", charSequence1, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, \n, \r,  , h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r,  , h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \n,  , \n, \n,  , \n,  , \n,  ]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        long[] longArray2 = new long[] { (short) 1, 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        long[] longArray2 = new long[] { (short) 1, 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass6 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", true, (-91), (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (-19), 873);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 72, 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        short[] shortArray4 = new short[] { (short) 100, (byte) -1, (short) 100, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", "hi!hi!\r", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r" + "'", str3, "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, charSequence1, 491);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\r", 393);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", " ", "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\r hi!hi!\nhi!hi! hi!hi!", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\n", false, 446, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        int[] intArray1 = new int[] { (byte) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (-453), 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-88) + "'", int3 == (-88));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double[] doubleArray2 = new double[] { 7, (-3) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[7.0, -3.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", 400, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        long[] longArray6 = new long[] { 10, 24, 1, (-72), 100, (-6) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, 24, 1, -72, 100, -6]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", " \n ", "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\r\r", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        long[] longArray6 = new long[] { (-6), 1, (-1), 1L, 1, 2 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-6, 1, -1, 1, 1, 2]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) '\n', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\r", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\r", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-44));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ? hi!hi!hi!hi! hi!hi!?? hi!hi!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi! hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true, (-313), (java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", (int) (byte) 0, 67);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        long[] longArray6 = new long[] { 10, 24, 1, (-72), 100, (-6) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, 24, 1, -72, 100, -6]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true, 14, (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 51, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r", true, 456, (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (-88), (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\r", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", false, (-401), (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 2, 24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double[] doubleArray4 = new double[] { 1L, (byte) 1, 0.0f, 100.0f };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 13, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "\rh\ri\r!\rh\ri\r!\r\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", " \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-43));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r,  , h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", 446);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 477, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 799 + "'", int1 == 799);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 177 + "'", int3 == 177);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi! hi!hi!\nhi!hi! hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", (java.lang.CharSequence) "", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-195));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        float[] floatArray2 = new float[] { 10.0f, (short) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        java.lang.Class<?> wildcardClass8 = floatArray2.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-22), 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true, 400, (java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!", 426, (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 493, 453);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (-86), 787);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, i, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, !, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, i, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, !, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", pattern1, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!" + "'", str3, "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", 494);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!?hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!hi!hi!? hi!hi!??hi!hi!? hi!hi!?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        comp5111.assignment.cut.ToolBox.LocaleTools localeTools9 = new comp5111.assignment.cut.ToolBox.LocaleTools();
        char[] charArray19 = new char[] { ' ', ' ', '#', '4', '#' };
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray19);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray19);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools25 = new comp5111.assignment.cut.ToolBox.RegExTools();
        java.lang.Object[] objArray26 = new java.lang.Object[] { boolean8, localeTools9, "\r", 10.0d, regExTools25 };
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray26);
        boolean boolean28 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray26);
        java.lang.Class<?> wildcardClass29 = objArray26.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        boolean[] booleanArray3 = new boolean[] { true, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        long[] longArray3 = new long[] { (-1L), (short) -1, (-6) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, -1, -6]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, \n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, i, \n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, !, \n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, \n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, i, \n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, !, \n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        short[] shortArray5 = new short[] { (short) 1, (short) 100, (byte) 0, (short) 0, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        java.lang.Class<?> wildcardClass7 = shortArray5.getClass();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 100, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", pattern1, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r" + "'", str3, "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? hi!hi!hi!hi! hi!hi!?? hi!hi!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi! hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        java.lang.Class<?> wildcardClass7 = floatArray0.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", 13, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        long[] longArray3 = new long[] { 100, 91, 72 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 91, 72]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!hi!", "\n", "\r", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n " + "'", str3, "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!", (int) '\r', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (int) '\000', (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 86, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\r", "\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-88), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", " \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r", 2, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n,  , \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n,  , \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        float[] floatArray3 = new float[] { 453, '\n', (-94) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[453.0, 10.0, -94.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\r\n", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "", " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-177) + "'", int3 == (-177));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!", 16, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-44), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 446);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        char[] charArray8 = new char[] { 'a', 'a', 'a', '\000', '4' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aaa\0004");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aaa\0004");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, a, \000, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false, (int) '\r', (java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!", (-90), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", " \n ", "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", 787);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false, (-313), (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 22, 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }
}

