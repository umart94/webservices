using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WebServicesClient
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window


    {

        public MyWebService.MyWebServiceSoapClient Client = new MyWebService.MyWebServiceSoapClient();
        public MainWindow()
        {
            InitializeComponent();
            
            string helloString = Client.HelloWorld();
            txtOutput.Text = helloString;
        }

        private void btnCalculate_Click(object sender, RoutedEventArgs e)
        {
            double val1;
            double val2;
            double result;
           Double.TryParse(txtInput1.Text.ToString(),out val1);
            Double.TryParse(txtInput2.Text.ToString(), out val2);
            result = Client.AddNumbers(val1, val2);
            
            txtOutput.Text += "\n val1 + val2 = " + result;


        }
    }
}
