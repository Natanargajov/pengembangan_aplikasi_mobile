<!-- res/layout/activity_main.xml -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="16dp"
tools:context=".MainActivity">

<!-- Komponen Form -->
<EditText
android:id="@+id/editTextName"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Name" />

<EditText
android:id="@+id/editTextEmail"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Email" />

<CheckBox
android:id="@+id/checkBoxSubscribe"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Subscribe to Newsletter" />

<RadioGroup
android:id="@+id/radioGroupGender"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal">

<RadioButton
android:id="@+id/radioButtonMale"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Male" />

<RadioButton
android:id="@+id/radioButtonFemale"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Female" />
</RadioGroup>

<Button
android:id="@+id/buttonSubmit"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="Submit" />

</LinearLayout>