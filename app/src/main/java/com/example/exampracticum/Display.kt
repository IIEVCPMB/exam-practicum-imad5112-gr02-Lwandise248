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
