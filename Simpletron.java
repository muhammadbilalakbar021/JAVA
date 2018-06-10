// The following code belongs to me
// Copyright © 2000 BNL tutorials
// ...

//                                                             This is my First Simpletron Program
//                                                              Made bY Bilal Akbar
import javafx.application.Application;//Code at Line             //By Bilal Akbar
import javafx.geometry.Pos;//Code at Line                        //By Bilal Akbar
import javafx.scene.Scene;//Code at Line                         //By Bilal Akbar
import javafx.scene.control.Button;//Code at Line                //By Bilal Akbar
import javafx.scene.control.RadioButton;//Code at Line           //By Bilal Akbar
import javafx.scene.layout.BorderPane;//Code at Line             //By Bilal Akbar
import javafx.scene.layout.HBox;//Code at Line                   //By Bilal Akbar
import javafx.scene.text.Font;//Code at Line                     //By Bilal Akbar
import javafx.stage.Stage;//Code at Line                         //By Bilal Akbar
import javafx.scene.layout.StackPane;//Code at Line              //By Bilal Akbar
import javafx.scene.control.Label;//Code at Line                 //By Bilal Akbar
import javafx.scene.control.TextField;//Code at Line             //By Bilal Akbar
import javafx.scene.control.TextArea;//Code at Line              //By Bilal Akbar
import java.awt.Desktop;//Code at Line                           //By Bilal Akbar
import  java.io.File;//Code at Line                              //By Bilal Akbar
import java.io.IOException;//Code at Line                        //By Bilal Akbar
import java.io.ObjectInputStream;//Code at Line                  //By Bilal Akbar
import java.nio.file.Files;//Code at Line                        //By Bilal Akbar
import java.nio.file.Paths;//Code at Line                        //By Bilal Akbar
import java.util.logging.Level;//Code at Line                    //By Bilal Akbar
import java.util.logging.Logger;//Code at Line                   //By Bilal Akbar
import javafx.event.EventHandler;//Code at Line                  //By Bilal Akbar
import javafx.event.ActionEvent;//Code at Line                   //By Bilal Akbar
import javafx.stage.FileChooser;//Code at Line                   //By Bilal Akbar
import java.util.Scanner;//Code at Line                          //By Bilal Akbar
import java.io.FileNotFoundException;//Code at Line              //By Bilal Akbar
import javafx.scene.control.TextInputDialog;//Code at Line       //By Bilal Akbar
import java.util.Optional;//Code at Line                         //By Bilal Akbar
import static javafx.scene.text.FontWeight.BOLD;//Code at Line   //By Bilal Akbar

//Code at Line                                                   //By Bilal Akbar
public class Simpletron extends Application

{
    private Desktop BilDesktop = Desktop.getDesktop();
    private static ObjectInputStream inpuTing;
    int InstructionCountBilal=0;
    int AccuuseMulator3 = 0;
    TextArea TextingAreaFORtext= new TextArea();

        //int height=25;
        //int width =25;
        // tArea.setPrefHeight(height);
        //tArea.setPrefWidth(width);


    final  int READing=10, WRITEing=11,LOADing=20,STOREing=21,ADDing=30,SUBTRACTing=31,DIViding=32,MULTIPLYing=33,BRANCH_ing=40,BRANCH_NEGative=41,BRANCH_ZERO=42,HALTing=43;//Code at Line        //By Bilal Akbar
    int [] Simulated_Ram = new int[100];
    @Override
    public void start(Stage primaryStage_SHOW )throws Exception
    {
        primaryStage_SHOW.setTitle("Simpletron");

        //Stack Pane Code
        System.out.println("My Stack Pane at line 59");
        StackPane Stack_paning = new StackPane();
        Stack_paning.setAlignment(Pos.CENTER);

        System.out.println("My Horizontal Box at line 63");
        HBox hbox_TopBorder = new HBox(10);
        hbox_TopBorder.setAlignment(Pos.CENTER);
        System.out.println("My Horizontal Box at line 67");
        HBox hbox_BottomBorder = new HBox();
        hbox_BottomBorder.setSpacing(10);
        hbox_BottomBorder.setAlignment(Pos.CENTER);

        //Label  ,Text Fiels code+ Settings of their Fonts
        System.out.println("Code of Accumulator (Label,TextField and its font Settings at 73");
        Label Accumulator01_Label = new Label("Accumulator");
        TextField Accumulator02_TextField= new TextField();
        Accumulator01_Label.setFont(new Font("Arial", 16));
        Accumulator02_TextField.setFont(Font.font("Arial",BOLD, 12));

        System.out.println("Code of InstructionCounter (Label,TextField and its font Settings at 73");
        Label InstructionCounter01_Label = new Label("InstCounter");
        TextField InstructionCounter02_TextField = new TextField();
        InstructionCounter01_Label.setFont(new Font("Arial", 16));
        InstructionCounter02_TextField.setFont(Font.font("Arial",BOLD, 12));

        System.out.println("Code of InstructionRegister (Label,TextField and its font Settings at 85");
        Label Instruction_Register01_Label = new Label("InstReg");
        TextField Instruction_Register02_TextField = new TextField();
        Instruction_Register01_Label.setFont(new Font("Arial", 16));
        Instruction_Register02_TextField.setFont(Font.font("Arial",BOLD, 12));

        System.out.println("Code of OperationCode (Label,TextField and its font Settings at 91");
        Label OperationCode01_Label = new Label("OpCode");
        TextField OperationCode02_TextField = new TextField();
        OperationCode01_Label.setFont(new Font("Arial", 16));
        OperationCode02_TextField.setFont(Font.font("Arial",BOLD, 12));

        System.out.println("Code of Operand (Label,TextField and its font Settings at 97");
        Label Operand01_Label = new Label("Operand");
        TextField Operand02_TextField = new TextField();
        Operand01_Label.setFont(new Font("Arial", 16));
        Operand02_TextField.setFont(Font.font("Arial",BOLD, 12));


        //Button Code
        Button Load_Program = new Button("Load Program");
        Button Next_Instruction = new Button("Execute Next Instrucion");

        //Radio Button Code
        RadioButton Exe_Instruction = new RadioButton("Exe one inst");
        RadioButton Exe_Program= new RadioButton("Exe Program");

        hbox_TopBorder.getChildren().addAll(Accumulator01_Label,Accumulator02_TextField,InstructionCounter01_Label,InstructionCounter02_TextField,Instruction_Register01_Label,Instruction_Register02_TextField,OperationCode01_Label,OperationCode02_TextField,Operand01_Label,Operand02_TextField);
        hbox_BottomBorder.getChildren().addAll(Load_Program,Next_Instruction,Exe_Instruction,Exe_Program);

        //Creating Border
       // BorderPane border = new BorderPane();
     //   border1.setTop(top);
        BorderPane borderpANE_Simpletron = new BorderPane();
        borderpANE_Simpletron.setTop(hbox_TopBorder);
        borderpANE_Simpletron.setBottom(TextingAreaFORtext);
        borderpANE_Simpletron.setBottom(hbox_BottomBorder);


        //Adding border to Stack Pane
      // sPane.getChildren().add(border);
        borderpANE_Simpletron.setCenter(TextingAreaFORtext);
       //sPane1.getChildren().add(tArea);
        Stack_paning.getChildren().add(borderpANE_Simpletron);


        //Creating Scene and Stage
        Scene heavy_Scene = new Scene(Stack_paning,1020,700);
        Stage stage = new Stage();
        stage.setScene(heavy_Scene);
        stage.show();

        //File option event Handler
        final FileChooser File_Selecting_Box = new FileChooser();
        Load_Program.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                File Simpletron_File = File_Selecting_Box.showOpenDialog(primaryStage_SHOW);
                if (Simpletron_File != null)
                {
                    Opening_FiletobeSimulated(Simpletron_File);

                    try {
                        Adding_IntegerstotoArray(Simpletron_File);

                    } catch (IOException ioException)
                    {
                        ioException.printStackTrace();
                    }

                    TextingAreaFORtext.setFont(Font.font("Verdana", 35));
                    PrintSimulated_TextArea(TextingAreaFORtext);



                }
            }
        });

        //Button 2 Code (Next Instruction Code)
        Next_Instruction.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event)
            {


                int InstructionRegister_Counter_Switch;
                int operationCode_Switch;
                int OperandMod_Switch;

                {
                    InstructionRegister_Counter_Switch=Simulated_Ram[InstructionCountBilal];
                    operationCode_Switch=InstructionRegister_Counter_Switch/100;
                    OperandMod_Switch=InstructionRegister_Counter_Switch%100;

                    //READ=10, WRITE=11,LOAD=20,STORE=21,ADD=30,SUB=31,DIV=32,MUL=33,BRANCH=40,BRANCHNEG=41,BRANCHZERO=42,HALT=43
                    switch(operationCode_Switch)
                    {
                        case READing:
                        {
                            TextInputDialog dialog = new TextInputDialog("");
                            dialog.setTitle("Reading Input");
                            dialog.setHeaderText("Taking Input from #User :-)");
                            dialog.setContentText("Enter Any Integer Number:");

                            Optional<String> InputString = dialog.showAndWait();
                            if (InputString.isPresent()){
                                System.out.println("Your name: " + InputString.get());
                                int Counter=0;
                                Counter= Integer.parseInt(InputString.get());
                                Simulated_Ram[OperandMod_Switch]=Counter;
                            }
                            break;
                        }
                        case WRITEing:
                        {

                            break;
                        }
                        case LOADing:
                        {
                            AccuuseMulator3=Simulated_Ram[OperandMod_Switch];
                            break;
                        }
                        case STOREing:
                        {
                            Simulated_Ram[OperandMod_Switch]=AccuuseMulator3;
                            break;
                        }
                        case ADDing:
                        {
                            AccuuseMulator3 += Simulated_Ram[OperandMod_Switch];
                            break;
                        }
                        case SUBTRACTing:
                        {
                            AccuuseMulator3 -=Simulated_Ram[OperandMod_Switch];
                            break;
                        }
                        case DIViding:
                        {
                            AccuuseMulator3 /=Simulated_Ram[OperandMod_Switch];
                            break;
                        }
                        case MULTIPLYing:
                        {
                            AccuuseMulator3 *=Simulated_Ram[OperandMod_Switch];
                            break;
                        }
                        case BRANCH_ing:
                        {
                            InstructionCountBilal=OperandMod_Switch;
                            break;
                        }
                        case BRANCH_NEGative:
                        {
                            if(AccuuseMulator3<0)
                            {
                                InstructionCountBilal=OperandMod_Switch;
                            }

                            break;
                        }
                        case BRANCH_ZERO:
                        {
                            if(AccuuseMulator3==0)
                            {
                                InstructionCountBilal=OperandMod_Switch;
                            }
                            break;
                        }
                        case HALTing:
                        {
                            break;
                        }
                    }


                    TextingAreaFORtext.setFont(Font.font("Verdana", 35));

                    //Setting the values of Instructin Counter
                    String IntegertoString_Converter;
                    IntegertoString_Converter = Integer.toString(InstructionCountBilal);
                    InstructionCounter02_TextField.setText(IntegertoString_Converter);

                    //Setting the values of Operation Code
                    IntegertoString_Converter=Integer.toString(operationCode_Switch);
                    OperationCode02_TextField.setText(IntegertoString_Converter);

                    //Setting the values of OPerand
                    IntegertoString_Converter=Integer.toString(OperandMod_Switch);
                    Operand02_TextField.setText(IntegertoString_Converter);

                    //Setting the values of Accumulator
                    IntegertoString_Converter=Integer.toString(AccuuseMulator3);
                    Accumulator02_TextField.setText(IntegertoString_Converter);

                    //Setting the values of Instruction Register
                    IntegertoString_Converter=Integer.toString(InstructionRegister_Counter_Switch);
                    Instruction_Register02_TextField.setText(IntegertoString_Converter);

                    PrintSimulated_TextArea(TextingAreaFORtext);



                }
                InstructionCountBilal++;
                }

        });
    }

    //Reading File
    private void Opening_FiletobeSimulated(File file)
    {
        try
        {
            inpuTing =new ObjectInputStream((Files.newInputStream(Paths.get(file.getPath()))));
        }
        catch (IOException io)
        {
            Logger.getLogger(Simpletron.class.getName()).log(Level.SEVERE ,null,io);
        }
    }

    //Storing the contents of File in ARRAY
    private void Adding_IntegerstotoArray(File file) throws FileNotFoundException,IOException
    {
        int Counter = 0;//Initializing Counter=1

       try
       {

           Scanner scan = new Scanner(new File(file.getPath()));//Making object of scanner to get file
           while (scan.hasNext())
           {
               Simulated_Ram[Counter] = scan.nextInt();//Converting files data in Ram
               Counter++;
           }
       }

       //EOF or File not Found exceptoin not woriking
       catch(IOException ioException)
       {
           System.err.println("Error writing to File ! Terminating");
       }
    }
    private void PrintSimulated_TextArea(TextArea textArea)//Display Pannel
    {


        String printString ="          0        1       2       3       4      5        6        7        8        9";
        textArea.setText(String.format("%s", printString));

        for(int i=0;i<100;i++)//Looop for printing
        {
            if(i%10==0)
            {
                if (i==0)
                {
                    textArea.appendText(String.format("  %n %-4s",Integer.toString(i)));
                }
                else
                {
                    textArea.appendText(String.format("%n%-4s",Integer.toString(i)));
                }

            }

            if(Simulated_Ram[i]!=0)
            {
                textArea.appendText(" "+Integer.toString(Simulated_Ram[i])+" ");
            }
            else
            {
                textArea.appendText(" 0000 ");
            }

        }
    }
}











