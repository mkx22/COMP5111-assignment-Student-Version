package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n  \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r\n ", 5, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n ", "   \r   \n \r\n ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "   \r   \n ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r \r \r ", "\n ", "\n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \n ", "       \n ", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n " + "'", str3, "  \n  \r \r   \n \r\n ");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   \n \r\n ", "\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) " \r \r \r ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.lang.Object[] objArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.CharSequence charSequence0 = null;
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length(charSequence0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) " \r ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n ", 94, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   \n \r\n ", "       \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r ", "   \r   \n ", "   \r   \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   ", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r    \n  \r \n ", "\r", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n  \r \r   \n \r\n     \n  \r \n " + "'", str3, "      \n  \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "    \r    \n  \r \n ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (int) (byte) 100, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        short[] shortArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n ", (java.lang.CharSequence) "\r", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "   \r   \n ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "\r", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "   \r   \n \r\n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n  \r \r   \n \r\n     \n  \r \n ", "\n ", "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n ", "    \r    \n  \r \n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "\n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "         \r    \r \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36) + "'", int3 == (-36));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r ", " \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \r \r ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " ", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        java.lang.Class<?> wildcardClass6 = booleanArray0.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n ", pattern1, "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n " + "'", str3, "   \r   \n ");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "   \r   ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "       \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r    \n  \r \n ", pattern1, "\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r ", (java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("       \n ", " \r \r \r ", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r ", "  \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r ", false, 19, (java.lang.CharSequence) " ", 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n ", pattern1, "\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "   \r   \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n ", pattern1, "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n " + "'", str3, "   \r   \n ");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n ", "", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", " \n  \r \r ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "\n", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n ", (-94), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \n ", pattern1, "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "    \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        java.lang.Class<?> wildcardClass4 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r    \n  \r \n ", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", " \r \r \r ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) " ", (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("         \r    \r \r   \n \r\n     \n  \r \n ", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n ", "       \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "    \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \r   ", true, (int) '#', (java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", 1, (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("       \n ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r\n ", 15, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n  \r \r   \n \r\n     \n  \r \n ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n  \r \r   \n \r\n     \n  \r \n " + "'", str3, "      \n  \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", "  \n  \r \r   \n \r\n ", " \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "\n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("       \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "    \r    \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16) + "'", int3 == (-16));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n ", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", (int) '#', (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \r \r ", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", " \r ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \r \r ", "         \r    \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "   \r   ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "      \n  \r \r   \n \r\n     \n  \r \n ", "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n ", "   \r   ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "   \r   \n ", "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", false, (int) (byte) 0, (java.lang.CharSequence) "   \r   ", 10, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, (int) 'a', (java.lang.CharSequence) "   \r   ", 3, 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \r\n ", "  \n  \r \r   \n \r\n ", "  \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r\n " + "'", str3, "\n \r\n ");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", (int) 'a', (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "    \r    \n  \r \n ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", true, (int) '\n', (java.lang.CharSequence) "hi!", 72, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \r   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "         \r    \r \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-35) + "'", int3 == (-35));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n ", true, (int) (byte) 0, charSequence3, 9, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r ", (int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "\n ", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n ", (java.lang.CharSequence) "    \r    \n  \r \n ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, (-35), (java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (-35));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r    \n  \r \n ", "\n ", "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("         \r    \r \r   \n \r\n     \n  \r \n ", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n ", (java.lang.CharSequence) " \r ", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r ", "      \n  \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r ", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \r \r ", "  \n  \r \r   \n \r\n ", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \r \r ", "\n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r " + "'", str3, "  \r \r ");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        boolean[] booleanArray3 = new boolean[] { false, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n  \r \r   \n \r\n ", "  \r ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n\n\r   \n \r\n ", 19, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (java.lang.CharSequence) "\n ", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "       \n ", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r ", "hi!", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \r   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n", "    \r       \r   \n \r\n  \r \n ", "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?   ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \r \r ", "\n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "\r" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", "\n", "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        int[] intArray2 = new int[] { '\r', 2 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[13, 2]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r ", 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) "", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\n \n \n \n\r\n \n \n \n\n\n \n", "      \n  \r \r   \n \r\n     \n  \r \n ", "hi!" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r \r ", "      \n  \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("       \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:        ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", (java.lang.CharSequence) "  \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r ", "  \r \r ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("         \r    \r \r   \n \r\n     \n  \r \n ", "  \n  \r \r   \n \r\n ", "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", (java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r ", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n ", (-36), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \n\n\r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ???   ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \r \r ", "   \r   \n ", "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r \r \r ", false, (-5), (java.lang.CharSequence) "    \r    \n  \r \n ", 4, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 4, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n \n \n \n\r\n \n \n \n\n\n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? ? ? ??? ? ? ??? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r \r \r ", " \r ", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \r \r \r \r " + "'", str3, " \r \r \r \r \r \r \r ");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r    \n  \r \n ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r \r \r \r \r ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \r \r \r \r " + "'", str3, " \r \r \r \r \r \r \r ");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n ", "  \r ", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r   \n \r\n " + "'", str3, "  \r \r \r   \n \r\n ");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r \r   \n \r\n ", pattern1, "  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r   \n \r\n " + "'", str3, "  \r \r \r   \n \r\n ");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", "  \n  \r \r   \n \r\n ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n\n\r   \n \r\n ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (-19), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \r\n ", "      \n  \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n", "   \r   \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r\n " + "'", str3, "\n \r\n ");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n ", (java.lang.CharSequence) "\n", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (-9), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "  \r ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \r\n ", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n ", pattern1, "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \n, \n, \r,  ,  ,  , \n,  , \r, \n,  ]");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n ", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r \r \r \r \r ", "\n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \r \r ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r ", " \r \r \r \r \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12) + "'", int3 == (-12));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r    \n  \r \n ", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        long[] longArray3 = new long[] { (short) 10, '\n', (-72) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass7 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, -72]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "         \r    \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "    \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r    \n  \r \n ", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \n ", " \n  \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n ", false, (int) '\r', charSequence3, (-72), (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n ", " \n  \r \r ", "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n " + "'", str3, "   \r   \n ");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \n  \r \r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ?  ? ?   ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:     ?        ?    ?  ? ?   ?     ?    ?  ? ?  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "       \n ", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n ", pattern1, " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " ", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  ]");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "hi!", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", false, 1, (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (int) (byte) 1, 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n\n\r   \n \r\n ", "   \r   \n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) "\n \r\n ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r ", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \n\n\r   \n \r\n ", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n ", " \r \r \r ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "    \r    \n  \r \n ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n ", pattern1, "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n\n\r   \n \r\n ", "\n ", "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "   \r   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", " \r \r \r \r \r \r \r ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \r ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "\n", (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (java.lang.CharSequence) "hi!", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("         \r    \r \r   \n \r\n     \n  \r \n ", "  \n\n\r   \n \r\n ", "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "", " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \r \r \r \r " + "'", str3, " \r \r \r \r \r \r \r ");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " ", "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "   \r   \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r ", " ", "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r    \n  \r \n ", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 20, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r,  , \r,  , \r,  , \r,  , \r,  , \r,  , \r,  ]");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (-36));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        boolean[] booleanArray4 = new boolean[] { false, false, false, false };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        java.lang.Class<?> wildcardClass9 = booleanArray4.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n ", "\n \r\n ", "  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n ", "  \r \r \r   \n \r\n ", "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n \r\n ", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \r\n ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r\n " + "'", str3, "\n \r\n ");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! ", "\r", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \n ", "  \n  \r \r   \n \r\n ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r \r ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r " + "'", str3, "  \r \r ");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \r,  , \r,  ]");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (-19), (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "\r", "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n  \r \r   \n \r\n     \n  \r \n ", pattern1, "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n  \r \r   \n \r\n     \n  \r \n " + "'", str3, "      \n  \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r \r \r \r \r ", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \r \r \r \r " + "'", str3, " \r \r \r \r \r \r \r ");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r \r   \n \r\n ", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! ", "    \r       \r   \n \r\n  \r \n ", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n\n\r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r \r \r   \n \r\n ", " \r \r \r \r \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \r\n ", " \n  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", pattern1, " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) " \n  \r \r ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \n ", charSequence1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r \r \r \r \r \r \r ", false, 12, (java.lang.CharSequence) "       \n ", (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", true, (int) '\n', charSequence3, 26, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", pattern1, "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", 19, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n  \r \r   \n \r\n     \n  \r \n ", pattern1, "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n  \r \r   \n \r\n     \n  \r \n " + "'", str3, "      \n  \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n ", 19, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) " \r \r \r ", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r       \r   \n \r\n  \r \n ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n ", pattern1, "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", " \r \r \r ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n]");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r\n ", (int) (byte) 0, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r \r   \n \r\n ", 22, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   ", "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   " + "'", str3, "   \r   ");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   ", "\n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "   \r   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    \r       \r   \n \r\n  \r \n ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n ", pattern1, "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n ", pattern1, "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n ", (java.lang.CharSequence) " \n  \r \r ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   ", (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) " \r \r \r ", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "  \n\n\r   \n \r\n ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", true, 27, (java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (-3), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (-36), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("       \n ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) " \r \r \r ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) "hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "hi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n", "  \r \r \r   \n \r\n ", "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r \r   \n \r\n ", " ", "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \n  \r \r   \n \r\n ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   ", 19, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "       \n ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n\n\r   \n \r\n ", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        double[] doubleArray3 = new double[] { 7, '\r', '#' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[7.0, 13.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   ", (java.lang.CharSequence) "hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n ", pattern1, "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "   \r   ", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("         \r    \r \r   \n \r\n     \n  \r \n ", " ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r " + "'", str3, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n  \r \r ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n  \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n  \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n,  ,  , \r,  , \r,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("   \r   \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 107 + "'", int1 == 107);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { " " };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        java.lang.Class<?> wildcardClass4 = charSequenceArray1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "  \r ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", "         \r    \r \r   \n \r\n     \n  \r \n ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r " + "'", str3, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    \r    \n  \r \n ", false, 16, (java.lang.CharSequence) "hi! ", (-94), 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", false, (-12), charSequence3, 0, (-94));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", 16, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "  \r ", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 27, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r    \n  \r \n ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r \r \r \r \r ", pattern1, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \r \r \r \r " + "'", str3, " \r \r \r \r \r \r \r ");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " \r \r \r \r \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-15) + "'", int3 == (-15));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n ", "  \n\n\r   \n \r\n ", "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("      \n  \r \r   \n \r\n     \n  \r \n ", "   \r   \n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \n ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r ", "", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! " + "'", str3, "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r \r \r   \n \r\n ", false, 107, (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 22, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 8, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "         \r    \r \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36) + "'", int3 == (-36));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n\n\r   \n \r\n ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "   \r   ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", " \n  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r \r   \n \r\n ", (java.lang.CharSequence) "  \r \r ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n ", "       \n ", "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("         \r    \r \r   \n \r\n     \n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:          ?    ? ?   ? ??     ?  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \n ", "", "  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r        \n " + "'", str3, "  \r \r        \n ");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("         \r    \r \r   \n \r\n     \n  \r \n ", "  \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r        \n ", (java.lang.CharSequence) "    \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        short[] shortArray3 = new short[] { (byte) -1, (short) 100, (byte) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[-1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \r \r ", "    \r       \r   \n \r\n  \r \n ", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \r \r \r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ? ? ?   ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) " \r ", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \r\n ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \r \r ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n ", (int) (byte) 10, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("         \r    \r \r   \n \r\n     \n  \r \n ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r    \n  \r \n ", "      \n  \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (-15), (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }
}

