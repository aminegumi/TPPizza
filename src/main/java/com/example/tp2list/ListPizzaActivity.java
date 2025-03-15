package com.example.tp2list;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp2list.adapter.PizzaAdapter;
import com.example.tp2list.entities.Pizza;
import com.example.tp2list.service.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    private ListView listView;
    private ProduitService pizzaService;
    private List<Pizza> pizzas;
    private ImageView shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        listView = findViewById(R.id.liste);
        shareButton = findViewById(R.id.shareButton);

        pizzaService = ProduitService.getInstance();

        if (pizzaService.findAll().isEmpty()) {
            loadPizzaData();
        }

        pizzas = pizzaService.findAll();

        PizzaAdapter adapter = new PizzaAdapter(this, pizzas);
        listView.setAdapter(adapter);

        shareButton.setOnClickListener(v -> {
        });
    }

    private void loadPizzaData() {


        pizzaService.create(new Pizza("BARBECUED CHICKEN PIZZA", 3, R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n-2 cups shredded Gouda cheese\n-1 small red onion, halved and thinly sliced\n-1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-grill, rustic flavor. They're perfect for spur-of-the-moment cookouts and summer dinners on the patio. —Alicia Trevithick, Temecula, California",
                "STEP 1:\n\n Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\nSTEP 2:\n\n Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\nSTEP 3:\n\n Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro. Yield: 2 pizzas (4 pieces each).",
                4));

        pizzaService.create(new Pizza("BRUSCHETTA PIZZA", 5, R.mipmap.pizza2, "35 min",
                "-1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves, thinly sliced\n- 1 tablespoon olive oil\n- 2 garlic cloves, minced\n- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried thyme\n- 1/2 teaspoon balsamic vinegar\n- 1/4 teaspoon salt\n- 1/8 teaspoon pepper\n- Additional fresh basil leaves, optional",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes, it's bound to become a family favorite. It's even better with a homemade, whole wheat crust! —Debra Kell, Owasso, Oklahoma",
                "STEP 1:\n\n In a small skillet, cook sausage over medium heat until no longer pink; drain. Place crust on an ungreased baking sheet. Top with pepperoni, sausage and cheese. Bake at 450° for 10-12 minutes or until cheese is melted.\n\nSTEP 2:\n\n In a small bowl, combine the tomatoes, sliced basil, oil, garlic, thyme, vinegar, salt and pepper. Spoon over pizza. Garnish with additional basil if desired. Yield: 8 slices.",
                8));
        pizzaService.create(new Pizza("MARGHERITA PIZZA", 2, R.mipmap.pizza3, "25 min",
                "- 1 prebaked 12-inch thin pizza crust\n- 2 tablespoons olive oil\n- 2 garlic cloves, minced\n- 1/2 teaspoon salt\n- 2 cups shredded mozzarella cheese\n- 2 medium tomatoes, thinly sliced\n- 1/4 cup fresh basil leaves, thinly sliced\n- 1/4 teaspoon freshly ground pepper",
                "A classic Italian favorite, this Margherita pizza features the colors of the Italian flag: red tomatoes, white mozzarella and green basil. The simplicity of fresh ingredients makes this pizza truly shine.",
                "STEP 1:\n\n Preheat oven to 450°. Place the crust on a baking sheet or pizza stone. Combine oil and garlic; brush over crust. Sprinkle with salt and half of the cheese.\n\nSTEP 2:\n\n Arrange tomato slices over cheese; top with basil, pepper and remaining cheese. Bake until cheese is melted, 8-10 minutes. Serve immediately.",
                4));

        pizzaService.create(new Pizza("PEPPERONI DEEP DISH PIZZA", 4, R.mipmap.pizza4, "45 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 1 cup warm water (110° to 115°)\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups all-purpose flour\n- 1 can (15 ounces) pizza sauce\n- 1 package (8 ounces) sliced pepperoni\n- 1 can (4 ounces) mushroom stems and pieces, drained\n- 1 cup shredded part-skim mozzarella cheese\n- 1 cup shredded cheddar cheese",
                "This Chicago-style deep dish pizza features a thick, buttery crust packed with layers of cheese and pepperoni. The sauce goes on top to prevent the crust from getting soggy.",
                "STEP 1:\n\n In a large bowl, dissolve yeast in warm water. Add oil, sugar, salt and 2 cups flour. Beat until smooth. Stir in enough remaining flour to form a soft dough.\n\nSTEP 2:\n\n Turn onto a floured surface; knead until smooth and elastic, 6-8 minutes. Place in a greased bowl, turning once to grease top. Cover and let rise in a warm place until doubled, about 1 hour.\n\nSTEP 3:\n\n Punch dough down. Press onto the bottom and up the sides of a greased 14-in. deep-dish pizza pan or a 12-in cast-iron skillet. Layer with cheeses, pepperoni, and mushrooms. Top with sauce.\n\nSTEP 4:\n\n Bake at 400° for 25-30 minutes or until crust is golden brown and cheese is melted.",
                6));

        pizzaService.create(new Pizza("MEDITERRANEAN VEGGIE PIZZA", 2, R.mipmap.pizza5, "30 min",
                "- 1 prebaked 12-inch thin pizza crust\n- 2 tablespoons olive oil\n- 3 garlic cloves, minced\n- 1 cup fresh baby spinach\n- 1/2 cup chopped roasted red peppers\n- 1/4 cup sliced Kalamata olives\n- 1/4 cup chopped red onion\n- 1 cup crumbled feta cheese\n- 1/4 cup grated Parmesan cheese\n- 1 teaspoon dried oregano",
                "This Mediterranean-inspired pizza is loaded with fresh vegetables and savory feta cheese. It's a perfect light and healthy option that's packed with flavor.",
                "STEP 1:\n\n Preheat oven to 450°. Place pizza crust on a baking sheet. Combine oil and garlic; brush over crust.\n\nSTEP 2:\n\n Top with spinach, roasted red peppers, olives and onion. Sprinkle with feta and Parmesan cheeses. Sprinkle with oregano.\n\nSTEP 3:\n\n Bake until cheese is melted and crust is crisp, 8-10 minutes. Serve immediately.",
                4));

        pizzaService.create(new Pizza("HAWAIIAN PIZZA", 3, R.mipmap.pizza6, "30 min",
                "- 1 prebaked 12-inch pizza crust\n- 1/2 cup pizza sauce\n- 1 1/2 cups shredded mozzarella cheese\n- 1 cup diced ham\n- 1 can (8 ounces) pineapple chunks, drained\n- 1/4 cup chopped green bell pepper",
                "Sweet and savory combine in this classic Hawaiian pizza. The juicy pineapple and savory ham create a perfect balance of flavors that's been popular for decades.",
                "STEP 1:\n\n Preheat oven to 425°. Place crust on a baking sheet. Spread with pizza sauce and sprinkle with 1 cup cheese.\n\nSTEP 2:\n\n Top with ham, pineapple and green pepper. Sprinkle with remaining cheese.\n\nSTEP 3:\n\n Bake until cheese is melted and crust is golden brown, 10-15 minutes.",
                4));

        pizzaService.create(new Pizza("BUFFALO CHICKEN PIZZA", 4, R.mipmap.pizza7, "40 min",
                "- 1 prebaked 12-inch pizza crust\n- 1/4 cup buffalo wing sauce\n- 2 cups shredded cooked chicken\n- 2 tablespoons butter, melted\n- 2 tablespoons hot sauce\n- 2 cups shredded mozzarella cheese\n- 1/2 cup crumbled blue cheese\n- 1/4 cup thinly sliced celery\n- 2 tablespoons chopped fresh parsley",
                "All the flavors of buffalo chicken wings in pizza form! This spicy and tangy creation is perfect for game day or any time you're craving something with a kick.",
                "STEP 1:\n\n Preheat oven to 425°. Place pizza crust on a baking sheet. Spread buffalo wing sauce over crust.\n\nSTEP 2:\n\n In a small bowl, combine chicken, melted butter and hot sauce; toss to coat. Arrange over crust. Top with mozzarella and blue cheese.\n\nSTEP 3:\n\n Bake until cheese is melted, 12-15 minutes. Sprinkle with celery and parsley before serving.",
                6));

        pizzaService.create(new Pizza("QUATTRO FORMAGGI", 2, R.mipmap.pizza8, "25 min",
                "- 1 prebaked 12-inch pizza crust\n- 2 tablespoons olive oil\n- 2 garlic cloves, minced\n- 1/2 cup shredded mozzarella cheese\n- 1/2 cup crumbled gorgonzola cheese\n- 1/2 cup shredded fontina cheese\n- 1/2 cup grated Parmesan cheese\n- 1 teaspoon dried Italian seasoning\n- Fresh basil leaves for garnish",
                "This classic four-cheese Italian pizza combines the rich flavors of mozzarella, gorgonzola, fontina, and Parmesan for a truly decadent experience.",
                "STEP 1:\n\n Preheat oven to 450°. Place crust on a baking sheet. Combine olive oil and garlic; brush over crust.\n\nSTEP 2:\n\n Mix all four cheeses together in a bowl. Sprinkle cheese mixture evenly over the crust. Sprinkle with Italian seasoning.\n\nSTEP 3:\n\n Bake until cheese is melted and bubbly, 8-10 minutes. Garnish with fresh basil leaves before serving.",
                4));

        pizzaService.create(new Pizza("MUSHROOM & TRUFFLE PIZZA", 2, R.mipmap.pizza9, "35 min",
                "- 1 prebaked 12-inch pizza crust\n- 2 tablespoons truffle oil\n- 2 cups mixed mushrooms (cremini, shiitake, oyster), sliced\n- 2 tablespoons butter\n- 2 garlic cloves, minced\n- 1 tablespoon fresh thyme leaves\n- 1/4 teaspoon salt\n- 1/4 teaspoon black pepper\n- 1 1/2 cups shredded mozzarella cheese\n- 1/4 cup grated Parmesan cheese\n- Fresh arugula for garnish",
                "This gourmet pizza features earthy mushrooms enhanced with the luxurious flavor of truffle oil. It's an elegant option that's sure to impress at your next dinner party.",
                "STEP 1:\n\n Preheat oven to 450°. In a large skillet, melt butter over medium heat. Add mushrooms and cook until golden brown, about 5 minutes. Add garlic, thyme, salt and pepper; cook 1 minute longer.\n\nSTEP 2:\n\n Place crust on a baking sheet. Brush with 1 tablespoon truffle oil. Top with mushroom mixture and cheeses.\n\nSTEP 3:\n\n Bake until cheese is melted and crust is golden brown, 10-12 minutes. Drizzle with remaining truffle oil and garnish with fresh arugula before serving.",
                4));

        pizzaService.create(new Pizza("TACO PIZZA", 4, R.mipmap.pizza10, "40 min",
                "- 1 pound ground beef\n- 1 envelope taco seasoning\n- 1 prebaked 12-inch pizza crust\n- 1 can (16 ounces) refried beans\n- 2 cups shredded cheddar cheese\n- 1 cup crushed tortilla chips\n- 1 cup shredded lettuce\n- 1 medium tomato, diced\n- 1/4 cup sliced black olives\n- Sour cream and salsa for serving",
                "This fun fusion combines two favorites: tacos and pizza! Loaded with classic taco toppings, it's like having taco night in pizza form.",
                "STEP 1:\n\n Preheat oven to 425°. In a large skillet, cook beef over medium heat until no longer pink, 5-7 minutes; drain. Stir in taco seasoning; prepare according to package directions.\n\nSTEP 2:\n\n Place crust on a baking sheet. Spread refried beans over crust. Top with beef mixture and sprinkle with cheese.\n\nSTEP 3:\n\n Bake until cheese is melted, 10-12 minutes. Top with tortilla chips, lettuce, tomato and olives. Serve with sour cream and salsa.",
                6));
    }
}