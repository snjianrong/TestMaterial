package test.com.material;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static test.com.material.R.id.collapsing_toolbar_layout;

public class TestCollapseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_collapse);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarc);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        CollapsingToolbarLayout ct = (CollapsingToolbarLayout) findViewById(collapsing_toolbar_layout);
        ct.setTitle("TestCollapse");
        ct.setExpandedTitleColor(Color.WHITE);
        ct.setCollapsedTitleTextColor(Color.YELLOW);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewc);
        recyclerView.setLayoutManager(new LinearLayoutManager(TestCollapseActivity.this));
        TestAdapter adapterMatchedNum = new TestAdapter(TestCollapseActivity.this);
        recyclerView.setAdapter(adapterMatchedNum);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabc);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

}
