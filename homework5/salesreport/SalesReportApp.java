package homework5.salesreport;

import java.text.NumberFormat;

public class SalesReportApp
{
    public static void main(String[] args)
    {
        // the sales numbers stored in a recutanglar array
        double[][] sales = { {1540, 2010, 2450, 1845},
                             {1130, 1168, 1847, 1491},
                             {1580, 2305, 2710, 1284},
                             {1105, 4102, 2391, 1576} };

        // get the currency format object
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // display a welcome message
        System.out.println("Welcome to the Sales Report Application.\n");

        // The first section
        System.out.println("Region\tQ1\t\t\t\tQ2\t\t\t\tQ3\t\t\t\tQ4"); // header
        for (int i = 0; i < sales.length; i++) // loop by row (region) length
        {
            System.out.print(i + 1); // row headers (Region)
            for (int j = 0; j < sales[i].length; j++) // loop by column (quarter) length
            {
                System.out.print("\t\t" + currency.format(sales[i][j]));
            }
            System.out.println(); // prints each sales
        }

        // The second section
        System.out.println("\nSales by region:"); // header
        for (int i = 0; i < sales.length; i++) // loop by row (region) length
        {
            double salesByRegion = 0; // initialize
            System.out.print("Region " + (i + 1) + ": "); // row headers (Region)
            for (int j = 0; j < sales[i].length; j++) // loop by column (quarter) length
            {
                salesByRegion += sales[i][j]; // adds each sales into sales by region
            }
            System.out.println(currency.format(salesByRegion)); // prints sales by region
        }

        // The third section
        System.out.println("\nSales by quarter:"); // header
        for (int i = 0; i < sales.length; i++) // loop by row (region) length
        {
            double salesByQuarter = 0; // initialize
            System.out.print("Q" + (i + 1) + ": ");
            for (int j = 0; j < sales[i].length; j++) // loop by column (quarter) length
            {
                // adds each sales into sales by quarter (assuming length of rows and columns are same)
                salesByQuarter += sales[j][i];
            }
            System.out.println(currency.format(salesByQuarter)); // prints sales by quarter
        }

        // The fourth section
        double totalSales = 0; // initialize
        System.out.print("\nTotal annual sales, all regions: "); // header
        for (int i = 0; i < sales.length; i++) // loop by row (region) length
        {
            for (int j = 0; j < sales[i].length; j++) // loop by column (quarter) length
            {
                totalSales += sales[i][j]; // adds each sales into total sales
            }
        }
        System.out.println(currency.format(totalSales)); // prints total sales
    }
}