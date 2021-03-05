package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        char[] charArray8 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        short[] shortArray2 = new short[] { (byte) -1, (byte) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   h i !   h i ! ", (java.lang.CharSequence) "\nhi!\nhi!\n", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", false, (-12), (java.lang.CharSequence) "hi!hi! hi!", (-1), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r   h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi!hi!", "\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\n\n", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   h i !   h i ! ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (-11), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "hi! hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5) + "'", int3 == (-5));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "hi!hi!hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (int) (short) 100, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   ", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "\r\n\r\n\r\r\n\r\n\r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray14);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray14);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray14);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray14);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray14);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n   ", (java.lang.CharSequence) " h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !h i ! ", (java.lang.CharSequence) "\n", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r\n\r\n\r", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 47, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  , h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     h     i     !           h     i     !     ", "     h     i     !           h     i     !     ", "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n" + "'", str3, "hi! hi!\n\n hi!\n\n");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\n", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (-94), 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("     h     i     !           h     i     !     ", pattern1, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     h     i     !           h     i     !     " + "'", str3, "     h     i     !           h     i     !     ");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charSequence1, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\r", "hi! hi!\n", "hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", true, 2, (java.lang.CharSequence) "   \n   ", (int) (short) 0, 47);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i !h i ! ", (java.lang.CharSequence) "\n\r\n", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass5 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   h i !   h i ! ", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r   h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 233 + "'", int1 == 233);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", pattern1, "\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" h i !   h i ! ", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i ! " + "'", str3, " h i !   h i ! ");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) " \r   h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n", (-10), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\nhi! hi!\n\n", (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "   \n   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n   ", "hi!hi!\nhi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n   " + "'", str3, "   \n   ");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!", (java.lang.CharSequence) "\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!", 8, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-19), 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", " h i !h i ! ", "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (-4), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n       \n   \n\n", (-4), (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\n\n", "hi!", "hi! hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n hi! hi!\n\n\n" + "'", str3, "hi! hi!\n hi! hi!\n\n\n");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        float[] floatArray4 = new float[] { '\000', '\r', 51, 46 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 13.0, 51.0, 46.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (java.lang.CharSequence) "\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\r\r\n\r\n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (-14));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", (java.lang.CharSequence) "hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\n\n", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   ");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ]");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n   \n       \n   \n\n", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n       \n   \n\n" + "'", str3, "\n   \n       \n   \n\n");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n   \n       \n   \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n", 22, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   h i !   h i ! ", "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h i !   h i ! " + "'", str3, "   h i !   h i ! ");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n", (java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hi!", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\r\n", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!", " ", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!hi!" + "'", str3, "\rhi!hi!hi!");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\r", pattern1, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n\r\r\n\r\n\r", "hi!hi!hi!hi!", "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\r\n\r\n\r", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i ! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   ", (java.lang.CharSequence) "hi!hi! hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", false, 0, (java.lang.CharSequence) "hi! hi!", 16, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 153 + "'", int1 == 153);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!hi!hi!hi!", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 14, (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-116) + "'", int3 == (-116));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r   h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?   h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", charSequence1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n       \n   \n\n", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r   h i ! ", "hi! hi!", "\n   \n       \n   \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! " + "'", str3, " \r   h i ! ");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  ", "hi! hi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i !h i ! ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        char[] charArray16 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray16);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray16);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray16);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray16);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\n\n hi!\n\n", "hi! hi!\n\n hi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        boolean[] booleanArray2 = new boolean[] { false, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\r", pattern1, "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (java.lang.CharSequence) "\rhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\n", "  ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\n", "\nhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\n", false, 285, (java.lang.CharSequence) "", (-5), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   h i !   h i ! ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\n", 0, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " h i !   h i ! ", (java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n       \n   \n\n", (java.lang.CharSequence) "hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        long[] longArray11 = new long[] { 16, (short) 0 };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray11);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray11);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray20);
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray20);
        java.lang.String str23 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray20);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray20);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray20);
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray20);
        java.lang.Object[] objArray27 = new java.lang.Object[] { byteArray4, (byte) -1, (short) 0, boolean14, str26 };
        boolean boolean28 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray27);
        boolean boolean29 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray27);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[16, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[100, -1, 10, 1], -1, 0, false, ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r   h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r   h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r   h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r,  ,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! " + "'", str3, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        long[] longArray3 = new long[] { 100L, (-3), (short) 0 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, -3, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\n", false, 100, (java.lang.CharSequence) " \r   h i ! ", (int) '#', (-4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n", 16, (-116));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! hi!\n\n", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   ", (java.lang.CharSequence) "\n\r\n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  ", pattern1, "hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 150 + "'", int3 == 150);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n       \n   \n\n", 94, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " h i !h i ! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " h i !h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " h i !h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h,  , i,  , !, h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n       \n   \n\n", (java.lang.CharSequence) "\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\r", "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", "\nhi!\nhi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! " + "'", str3, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        long[] longArray4 = new long[] { 100L, (short) -1, 10L, 16 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[100, -1, 10, 16]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!", (-6), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        long[] longArray3 = new long[] { 100L, (-3), (short) 0 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, -3, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        char[] charArray9 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! " + "'", str3, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!", 0, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", (-116));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   h i !   h i ! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n   \n       \n   \n\n", 51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "hi! hi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "\n\r\n", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i ! ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { '#', 'a', '\n', '4', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n", (int) (short) 0, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\rhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray15);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray15);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray15);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" h i !   h i ! ", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", 10, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" h i !   h i ! ", "\r hi!", "\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i ! " + "'", str3, " h i !   h i ! ");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, (-3), (java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", 17, (-106));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        float[] floatArray2 = new float[] { (byte) 0, '#' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        java.lang.Class<?> wildcardClass5 = floatArray2.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "  ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", true, 94, (java.lang.CharSequence) "hi!hi!hi!hi!", (-6), 153);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\n", (java.lang.CharSequence) "  ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\rhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", (java.lang.CharSequence) " h i !   h i ! ", 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   ", (java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!hi!", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n   \n       \n   \n\n", (java.lang.CharSequence) " h i !   h i ! ", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!hi!hi!", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  , h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " h i !h i ! ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!", "\r\n\r\n\r\r\n\r\n\r", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi! hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", " h i !   h i ! ", "\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!" + "'", str3, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\n\n", false, (-4), (java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (int) 'a', 47);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 153, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   h i !   h i ! ", (java.lang.CharSequence) "\n   \n       \n   \n\n", 233);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi! hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\r", (java.lang.CharSequence) " h i !h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!hi!hi!", 153);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!", " h i !   h i ! ", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!" + "'", str3, "hi!hi! hi!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", pattern1, "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     h     i     !           h     i     !     ", pattern1, "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     h     i     !           h     i     !     " + "'", str3, "     h     i     !           h     i     !     ");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", 47, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray14);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray14);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray14);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray14);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!", charArray14);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \n   ", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n   \n       \n   \n\n", "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", pattern1, "\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i ! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! hi!\n\n", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\r", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i ! ", (-15), (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", "   h i !   h i ! ", "\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hi!\n\n hi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hi!?? hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        long[] longArray3 = new long[] { '\000', 1, 72 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 1, 72]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! hi!\n\n", true, (-19), (java.lang.CharSequence) "\n\r\n", 10, 285);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", pattern1, "\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!" + "'", str3, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!", " ", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!" + "'", str3, "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!hi!", pattern1, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!" + "'", str3, "hi!hi!\nhi!hi!");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\r", (java.lang.CharSequence) " \r   h i ! ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", 7, 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! hi!\n\n", "", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi! hi!\n\n" + "'", str3, "\r\nhi! hi!\n\n");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i !   h i ! ", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", "hi!", " h i !h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n" + "'", str3, "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray15);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", charArray15);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r   h i ! ", charArray15);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\n", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   h i !   h i ! ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !h i ! ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", 2, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nhi!\nhi!\n", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     h     i     !           h     i     !     ", 16, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r   h i ! ", (java.lang.CharSequence) "\n\r\n", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "hi!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   ", pattern1, "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "hi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double[] doubleArray5 = new double[] { (-6), 10.0f, 3, (byte) 100, '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-6.0, 10.0, 3.0, 100.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!", false, (-91), (java.lang.CharSequence) "\r", (-19), (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   h i !   h i ! ", (int) '\n', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n", "\n", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (java.lang.CharSequence) "hi!hi!\nhi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" h i !h i ! ", "hi! hi!\n\n", "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !h i ! " + "'", str3, " h i !h i ! ");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 207 + "'", int1 == 207);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        double[] doubleArray5 = new double[] { (-9), (-1.0d), 5, (byte) 0, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-9.0, -1.0, 5.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        long[] longArray2 = new long[] { (-91), 19 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass5 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-91, 19]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\n", " h i !   h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "\r\n\r\n\r\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" h i !h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", 12, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!" + "'", str3, "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-3), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\r", 285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (-5), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r\n\r\r\n\r\n\r", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.lang.String[] strArray3 = new java.lang.String[] { "\r", "\n\n", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "\r hi!", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", false, 46, (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 94, 46);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n       \n   \n\n", 4, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 91, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r\n\r", (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\n", (int) (short) -1, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\n\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", 14, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   h i !   h i ! ", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        double[] doubleArray2 = new double[] { 1, (short) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, h, i, !, \r, h, i, !, h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! hi!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) "\rhi!hi!hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " h i !h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 16, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-3), 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", (java.lang.CharSequence) "\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (java.lang.CharSequence) "\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        double[] doubleArray5 = new double[] { (-6), 10.0f, 3, (byte) 100, '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-6.0, 10.0, 3.0, 100.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\nhi!\n\nhi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", (-4), (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!" + "'", str3, "hi!hi! hi!");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   h i !   h i ! ", "\n\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h i !   h i ! " + "'", str3, "   h i !   h i ! ");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 72, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\r\r\n\r\n\r", pattern1, "\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", pattern1, "hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "\r\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi! hi!hi!", "hi! hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n", "   h i !   h i ! ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n" + "'", str3, "hi! hi!\n");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "   h i !   h i ! ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n\r", "   h i !   h i ! ", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi! hi!\n\n", (java.lang.CharSequence) "hi! hi!\n", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", 22, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\n", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n", (-6));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "", "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!" + "'", str3, "hi!hi!\nhi!hi!");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", "\n", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! " + "'", str3, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", 9, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\n\n", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n" + "'", str3, "hi! hi!\n\n");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\r", (java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "   \n   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        long[] longArray5 = new long[] { (short) 10, (byte) 10, 0L, '\r', 72 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 10, 0, 13, 72]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r   h i ! ", pattern1, "hi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! " + "'", str3, " \r   h i ! ");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        char[] charArray16 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray16);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", charArray16);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray16);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray16);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   ", (-7), 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\n\n hi!\n\n", "hi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!", " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" h i !h i ! ", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !h i ! " + "'", str3, " h i !h i ! ");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray15);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray15);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray15);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n\r", false, (-2), (java.lang.CharSequence) "\nhi!\nhi!\n", (-22), 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\n\n hi!\n\n", "\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!", (-72), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", pattern1, "\rhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.lang.String[] strArray2 = new java.lang.String[] { "", " " };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str19 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (java.lang.CharSequence) "\nhi! hi!\n\n", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!", 233);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", (-6), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!hi!\nhi!hi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray14);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence4, charArray14);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!", charArray14);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r   h i ! ", charArray14);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) "", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   h i !   h i ! ", "\r", "hi! hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h i !   h i ! " + "'", str3, "   h i !   h i ! ");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", true, (int) (byte) -1, (java.lang.CharSequence) "\n", (-2), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi! hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        long[] longArray2 = new long[] { 3, 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   ", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi! hi!\n\n", 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!", true, (-22), charSequence3, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!", (-10), 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!", pattern1, "\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!" + "'", str3, "\r hi!");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\n", pattern1, "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n" + "'", str3, "hi! hi!\n");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (java.lang.CharSequence) "     h     i     !           h     i     !     ", (-106));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi! hi!hi!", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n", 11, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (int) (short) 1, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\nhi! hi!\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   h i !   h i ! ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "   h i !   h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "   h i !   h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "   \n   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n   \n       \n   \n\n", (-116), (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! hi!\n\n", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   h i !   h i ! ", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\n", "\nhi!\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   h i !   h i ! ", "\r\nhi! hi!\n\n", "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h i !   h i ! " + "'", str3, "   h i !   h i ! ");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", "\n", "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n\r\n" + "'", str3, "hi! hi!\n\n hi!\n\n\r\n");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi! hi!\n\n", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi! hi!\n\n", "hi! hi!\n\n hi!\n\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n   \n       \n   \n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray15);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray15);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray15);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray15);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray15);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray15);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n", 103, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   h i !   h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        double[] doubleArray1 = new double[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n\r\r\n\r\n\r", "\n\n", "hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "  ", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi! hi!\n\n hi!\n\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.lang.String[] strArray2 = new java.lang.String[] { "", " " };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\r", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\rh i !\r\n\r\n\rh i ! ", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i !   h i ! ", (java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "hi! hi!\n", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   h i !   h i ! ", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass9 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!", (java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 11, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i !   h i ! ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\n\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n       \n   \n\n", pattern1, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n       \n   \n\n" + "'", str3, "\n   \n       \n   \n\n");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\n\n");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! hi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! hi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , h, i, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("     h     i     !           h     i     !     ", pattern1, "\r\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     h     i     !           h     i     !     " + "'", str3, "     h     i     !           h     i     !     ");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) " h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", (java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", (java.lang.CharSequence) "\nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n \nhi!\nhi!\n\nhi!\nhi!\nh\nhi!\nhi!\n\nhi!\nhi!\ni\nhi!\nhi!\n\nhi!\nhi!\n!\nhi!\nhi!\n\nhi!\nhi!\n", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n \n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \nh\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \ni\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n!\n h i !h i ! \n h i !h i ! \n\n h i !h i ! \n h i !h i ! \n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n hi! hi!\n\n\n", (java.lang.CharSequence) "   \n   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!\rhi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", false, (-5), (java.lang.CharSequence) "\nhi! hi!\n\n", 4, (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        long[] longArray2 = new long[] { (-91), 19 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass4 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-91, 19]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.lang.String[] strArray3 = new java.lang.String[] { "\r", "\n\n", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  ", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", "hi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray15 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence5, charArray15);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   ", charArray15);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray15);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray15);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! hi!", charArray15);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }
}

