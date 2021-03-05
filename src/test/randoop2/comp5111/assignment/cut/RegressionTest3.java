package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i !h i ! ", (java.lang.CharSequence) "hi! hi!", (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\nhi!hi!", "hi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n", (int) '\000', 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\n\n", "\r\n\r\n\r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n" + "'", str3, "hi! hi!\n\n");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", 1, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        double[] doubleArray5 = new double[] { (-6), 10.0f, 3, (byte) 100, '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-6.0, 10.0, 3.0, 100.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!hi!", "hi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n", 0, (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!", (int) (short) 100, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", "hi! hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n\r", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        int[] intArray5 = new int[] { ' ', 13, (-19), 8, (-10) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 13, -19, 8, -10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi! hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi! hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi! hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !,  , h, i, !]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        long[] longArray2 = new long[] { 16, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[16, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("     h     i     !           h     i     !     ", "   h i !   h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     h     i     !           h     i     !     " + "'", str3, "     h     i     !           h     i     !     ");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\n", pattern1, "hi! hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n" + "'", str3, "hi! hi!\n");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\r", (int) (short) 1, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\n\nhi!\n\n", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!" + "'", str3, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n", (-11));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\n\n", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n" + "'", str3, "hi! hi!\n\n");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i !   h i ! ", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!", true, (-11), charSequence3, 100, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!", 19, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n", (java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi! hi!hi!", (java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) '#', 46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i !   h i ! ", "hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i ! " + "'", str3, " h i !   h i ! ");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) " h i !h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   ", "\nhi!\nhi!\n", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\nhi!hi!", "\nhi! hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!", (-11));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!", (-94), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray11);
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence5, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi! hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "hi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" h i !h i ! ", "", " h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! " + "'", str3, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", pattern1, "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-6));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!", "hi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   h i !   h i ! ", "   h i !   h i ! ", "hi! hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n" + "'", str3, "hi! hi!\n");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!", (java.lang.CharSequence) "hi!hi!\nhi!hi!", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! hi!\n\n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   ", pattern1, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !,  , h, i, !, h, h, i, !, h, i, !,  , h, i, !, i, h, i, !, h, i, !,  , h, i, !, !, h, i, !, h, i, !,  , h, i, !, h, h, i, !, h, i, !,  , h, i, !, i, h, i, !, h, i, !,  , h, i, !, !, h, i, !, h, i, !,  , h, i, !,  , h, i, !, h, i, !,  , h, i, !, h, h, i, !, h, i, !,  , h, i, !, i, h, i, !, h, i, !,  , h, i, !, !, h, i, !, h, i, !,  , h, i, !, h, h, i, !, h, i, !,  , h, i, !, i, h, i, !, h, i, !,  , h, i, !, !, h, i, !, h, i, !,  , h, i, !]");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!", pattern1, "     h     i     !           h     i     !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (-14), 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!", 16, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!", "hi! hi!\n\n", "hi! hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, \n, h, i, !, \n]");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   ", "\r\n\r\n\r\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n", "\r\n\r\n\r", "     h     i     !           h     i     !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n" + "'", str3, "\n\n");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\n\n", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   h i !   h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\r\n\r\n\r", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\n\nhi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!??hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "     h     i     !           h     i     !     ", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "     h     i     !           h     i     !     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   h i !   h i ! ", "\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!", (java.lang.CharSequence) "hi!hi!", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i !   h i ! ", pattern1, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i ! " + "'", str3, " h i !   h i ! ");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 0, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi!hi!\nhi!hi!", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\r\r\n\r\n\r", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\n", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String[] strArray3 = new java.lang.String[] { "\r", "\n\n", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\n", true, (int) (short) 1, (java.lang.CharSequence) "hi!hi! hi!hi!", 15, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.Object[] objArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) "hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, " h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n", pattern1, "   h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n" + "'", str3, "hi! hi!\n");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   h i !   h i ! ", "\n\n", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h i !   h i ! " + "'", str3, "   h i !   h i ! ");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("     h     i     !           h     i     !     ", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("     h     i     !           h     i     !     ", "hi! hi!", " h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     h     i     !           h     i     !     " + "'", str3, "     h     i     !           h     i     !     ");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\nhi!\nhi!\n", "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!", "\r\n\r\n\r\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\n", "\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\nhi!\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (-14), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", " h i !h i ! ", "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!", (java.lang.CharSequence) "   ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\r\r\n\r\n\r", "hi! hi!\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r\r\n\r\n\r" + "'", str3, "\r\n\r\n\r\r\n\r\n\r");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double[] doubleArray1 = new double[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", "hi!", "hi! hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "hi!hi!\nhi!hi!", "   h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!", (java.lang.CharSequence) "hi!hi!hi!hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\nhi!\nhi!\n", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!", "hi!hi! hi!hi!", "     h     i     !           h     i     !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     h     i     !           h     i     !     " + "'", str3, "     h     i     !           h     i     !     ");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!", (java.lang.CharSequence) "\n\n", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", " h i !h i ! ", "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!" + "'", str3, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?????h i !?????h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\n", pattern1, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n" + "'", str3, "hi! hi!\n");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "", "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\n\r\n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\n\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\n\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, \n, \r, \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        float[] floatArray3 = new float[] { 2, (-1.0f), 2 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, -1.0, 2.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n\r", " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", "hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String[] strArray2 = new java.lang.String[] { "", " " };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String[] strArray3 = new java.lang.String[] { "\r", "\n\n", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     h     i     !           h     i     !     ", (java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !h i ! ", charSequence1, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" h i !h i ! ", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !h i ! " + "'", str3, " h i !h i ! ");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! hi!\n\n", " h i !h i ! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "   ", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\n", "   ", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi! hi!\n\n", "hi!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double[] doubleArray1 = new double[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  , h,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  , i,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  , !,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ]");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        char[] charArray9 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " h i !   h i ! ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 153 + "'", int3 == 153);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!hi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " h i !   h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   h i !   h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " h i !   h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " h i !   h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h,  , i,  , !,  ,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n", (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n", (java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "hi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi! hi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi! hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 153);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\n\n", (java.lang.CharSequence) " h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\nhi!hi!", "\nhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n", (java.lang.CharSequence) "\nhi! hi!\n\n", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        boolean[] booleanArray3 = new boolean[] { false, false, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\n\n", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r\n\rh i !\r\n\r\n\rh i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   ", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", (java.lang.CharSequence) "\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\n\n", "\nhi!\n\nhi!\n\n", " h i !h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n" + "'", str3, "hi! hi!\n\n");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n", (java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi! hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     h     i     !           h     i     !     ", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !   h i ! ", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!hi!", "hi! hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   h i !   h i ! ", " ", "\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\n", pattern1, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\n");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " h i !   h i ! ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\r\n\r\n\r\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi! hi!\n", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\n", "hi!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        char[] charArray14 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray14);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray14);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray14);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray14);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", true, 72, (java.lang.CharSequence) "hi!", 0, (-5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\n\n", pattern1, "hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n" + "'", str3, "hi! hi!\n\n");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!", "\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n", (java.lang.CharSequence) "   ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!", (java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!", "hi!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! hi!\n\n", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\n", (java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        boolean[] booleanArray4 = new boolean[] { true, true, false, false };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   ", "   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!", (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", false, 4, (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (-72), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) ' ', 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "\nhi!\n\nhi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!", 5, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", 14, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\n", (-22), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (-10), 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "\r", "hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "\r\n\r\n\r", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" h i !h i ! ", "", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\nhi!hi!", "\nhi! hi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "     h     i     !           h     i     !     ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!", (java.lang.CharSequence) "   ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\r", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", false, (-22), (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", (-6), 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!", (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!", (java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   h i !   h i ! ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h i !   h i ! " + "'", str3, "   h i !   h i ! ");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     h     i     !           h     i     !     ", "\n\n", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     h     i     !           h     i     !     " + "'", str3, "     h     i     !           h     i     !     ");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!", " h i !   h i ! ", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\n", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\r", (-13), 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi! hi!", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!", "\nhi!\n\nhi!\n\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!" + "'", str3, "hi!hi! hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        short[] shortArray5 = new short[] { (byte) 0, (short) 100, (byte) 10, (short) 1, (short) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 100, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\r\n\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5) + "'", int3 == (-5));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   h i !   h i ! ", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 17, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "\r\n\r\n\r\r\n\r\n\r", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        double[] doubleArray1 = new double[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) "     h     i     !           h     i     !     ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
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
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\n\n", (java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", "hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", pattern1, "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! " + "'", str3, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!", (java.lang.CharSequence) "\n\r\n", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   h i !   h i ! ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! hi!\n\n", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\n\n", "hi!", "hi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n" + "'", str3, "hi! hi!\n\n hi!\n\n");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\nhi!hi!", pattern1, "\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!" + "'", str3, "hi!hi!\nhi!hi!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\r", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\r" + "'", str3, "\r\n\r\n\r");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        double[] doubleArray2 = new double[] { 1, (short) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (int) (byte) 100, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "hi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\n\n", (java.lang.CharSequence) " h i !h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i !   h i ! ", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!hi!", "     h     i     !           h     i     !     ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!", "hi! hi!\n\n hi!\n\n", "hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!" + "'", str3, "\r hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\r\r\n\r\n\r", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (int) (byte) 0, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "     h     i     !           h     i     !     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n", 15, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     h     i     !           h     i     !     ", (java.lang.CharSequence) "hi! hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        int[] intArray2 = new int[] { '#', (-1) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! hi!\n\n", pattern1, "   h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n", (java.lang.CharSequence) "\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i ! ", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!", charArray5);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n", "\nhi!\n\nhi!\n\n", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n" + "'", str3, "hi! hi!\n");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!", 14, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", 5, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", pattern1, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!" + "'", str3, "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (short) -1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "hi!hi!", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", " ", " " };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi! hi!???hi! hi!???hi! hi!??h?hi! hi!??i?hi! hi!??!?hi! hi!???hi! hi!???hi! hi!??h?hi! hi!??i?hi! hi!??!?hi! hi!?? ?hi! hi!???hi! hi!???hi! hi!??h?hi! hi!??i?hi! hi!??!?hi! hi!???hi! hi!???hi! hi!??h?hi! hi!??i?hi! hi!??!?hi! hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", false, 21, (java.lang.CharSequence) "\n\r\n", 14, 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !,  , h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        long[] longArray4 = new long[] { (byte) 100, 1L, (byte) 100, (-3) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[100, 1, 100, -3]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double[] doubleArray2 = new double[] { 1, (short) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray2);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " h i !h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n", (-11), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!", "", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! " + "'", str3, " \r   h i ! ");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\n\n hi!\n\n", "\r\n\r\n\r", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\n\n hi!\n\n" + "'", str3, "hi! hi!\n\n hi!\n\n");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence5, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     h     i     !           h     i     !     ", charArray9);
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi! hi!hi!", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", (-94), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r   h i ! ", "\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! " + "'", str3, " \r   h i ! ");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   h i !   h i ! ", pattern1, "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h i !   h i ! " + "'", str3, "   h i !   h i ! ");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !   h i ! ", (java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "\r\n\r\n\r", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i ! ", 3, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!", "hi! hi!", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! hi!\n\n", (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\n", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   h i !   h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (int) (byte) 0, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\n\n", (java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!", "hi!hi! hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!", (-2), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r   h i ! ", 4, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", false, (int) (short) 100, (java.lang.CharSequence) "     h     i     !           h     i     !     ", (-13), (-13));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " h i !   h i ! ", (java.lang.CharSequence) "\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", (-19), (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   ", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " h i !h i ! ", false, 100, (java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", 17, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", pattern1, " h i !h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! " + "'", str3, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        char[] charArray8 = new char[] { '#', 'a', '\n', '4', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a\n4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a\n4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a, \n, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n   " + "'", str3, "   \n   ");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!", false, 153, (java.lang.CharSequence) "\n\r\n", 15, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, (int) '#', (java.lang.CharSequence) "\r\n\r\n\r", 21, (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!", (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , h, i, !]");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r\n\r", "  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?????h i !?????h i !  ?????h i !?????h i ! h?????h i !?????h i !  ?????h i !?????h i ! i?????h i !?????h i !  ?????h i !?????h i ! !?????h i !?????h i ! h?????h i !?????h i !  ?????h i !?????h i ! i?????h i !?????h i !  ?????h i !?????h i ! !?????h i !?????h i !  ?????h i !?????h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi! hi!\n\n", "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "hi! hi!\n\n hi!\n\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hi!\nhi!hi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r   h i ! ", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!", "\r", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!" + "'", str3, "hi! hi!");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\n", 47, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", "hi! hi!", "hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        float[] floatArray3 = new float[] { 2, (-1.0f), 2 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        java.lang.Class<?> wildcardClass9 = floatArray3.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, -1.0, 2.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  , \n,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi! hi!hi!", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "hi! hi!\n\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!", charSequence1, (-15));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r\n\r\r\n\r\n\r", "hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! hi!\n\n", (-13), 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n", " h i !   h i ! ", "\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n" + "'", str3, "\n\n");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "   \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r   h i ! ", (java.lang.CharSequence) " h i !h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (-4), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\nhi!hi!", "\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ", (java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi! hi!???hi! hi!???hi! hi!??h?hi! hi!??i?hi! hi!??!?hi! hi!???hi! hi!???hi! hi!??h?hi! hi!??i?hi! hi!??!?hi! hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", pattern1, "\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (java.lang.CharSequence) "\n", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n\r", 51, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " h i !h i ! ", (java.lang.CharSequence) "   h i !   h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!", (java.lang.CharSequence) "\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!", "\nhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\n\n", charArray11);
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
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi! hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !,  , h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi! hi!\n\n", "hi!", "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n       \n   \n\n" + "'", str3, "\n   \n       \n   \n\n");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   ", (java.lang.CharSequence) "\r", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (java.lang.CharSequence) "  ", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   h i !   h i ! ", (java.lang.CharSequence) "   h i !   h i ! ", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", "\r hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (-72), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n       \n   \n\n", "\nhi! hi!\n\n", "hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi! hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!hhi!hi! hi!ihi!hi! hi!!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n       \n   \n\n" + "'", str3, "\n   \n       \n   \n\n");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!", pattern1, " h i !   h i !   h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i ! h h i !   h i !   h i !   h i ! i h i !   h i !   h i !   h i ! ! h i !   h i !   h i !   h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.lang.String[] strArray3 = new java.lang.String[] { "\r", "\n\n", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   ", (int) '\r', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 285 + "'", int1 == 285);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "   \n   ", 285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" h i !   h i ! ", "hi!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", pattern1, "   \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n" + "'", str3, "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r\n\r", "hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n\r", (java.lang.CharSequence) "   ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r   h i ! ", "\n   \n       \n   \n\n", "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! " + "'", str3, " \r   h i ! ");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!", "hi! hi!\n", "hi! hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!" + "'", str3, "hi! hi!");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! hi!\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi! hi!\n\n", "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-106) + "'", int3 == (-106));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n \nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n", true, (int) '#', (java.lang.CharSequence) "", 11, (-106));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n\rh i !\r\n\r\n\rh i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \n   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   h i !   h i ! ", true, 0, (java.lang.CharSequence) " h i !   h i ! ", (int) (short) 100, (-10));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", (-13), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        char[] charArray13 = new char[] { '4', '4', ' ', '\n', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!\n\n", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray13);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\n", (java.lang.CharSequence) "hi! hi!\n\n hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n   \n       \n   \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n   ", (-12), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n   ", 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n\nhi! hi!\n\n\nhi! hi!\n\nh\nhi! hi!\n\ni\nhi! hi!\n\n!\nhi! hi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\n\n hi!\n\n", (-4), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ", pattern1, "hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! " + "'", str3, "\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i ! h\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! i\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! !\r\n\r\n\rh i !\r\n\r\n\rh i !  \r\n\r\n\rh i !\r\n\r\n\rh i ! ");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r   h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!hi!ihi!hi!hi!hi!!hi!hi!hi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, (int) (byte) 0, (java.lang.CharSequence) "hi!hi! hi!", 1, (-14));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }
}

