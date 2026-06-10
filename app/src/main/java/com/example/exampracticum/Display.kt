class Display : AppCompatActivity {
//Declarations
    private lateinit var btnDisplay: Button
    private lateinit var btnBack : Button
    private lateinit var tvTitle : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display)
   //Typecasting
        btnDisplay = findViewById(R.id.btnDisplay)
        btnBack = findViewById(R.id.btnBack)
        tvTitle = findViewById(R.id.tvTitle)

    }}
        //Btn setOnClickListener
        btnBack.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            //Parallel arrays
            val itemName = arrayOf("Tent,Meat,Sleeping bags")
            val Description = arrayOf("Shelter,food,warmth")
            val quantities = arrayOf(1,3,2)
            val comments = arrayOf("")

            var totalPacked = 0
            for (qty in quantities){
                totalPacked += qty
            }

            //Loop through arrays and Display each of them
            for (i in itemName.indices){
            val itemView = TextView(this)
            itemView.text =""
            }
