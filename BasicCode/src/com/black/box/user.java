package com.black.box;

public class user {

	public static void main(String[] args) {

/* Processing states. */
enum request_fsm {
    REQUEST_FSM_1 = 0,
    REQUEST_FSM_2,
    REQUEST_FSM_3,
    ...
    REQUEST_FSM_MAX,
};

/* Messages to be printed to the user to indicate the type of
 * expected input. */
static const char *printf_str[REQUEST_FSM_MAX] = {
    "message #1\n",
    "message #2\n",
    "message #3\n",
    ...
};

/* Format strings to be parsed with `scanf`. */
static const char *scanf_str[REQUEST_FSM_MAX] = {
    "%d", /* assume you want an integer. */
    "%10s", /* then a string. */
    "%d", /* then an integer again. */
    ...
};

/* Data pointers to be updated with user input. */
int i1, i3;
char s2[10 + 1];
void *data_ptr[REQUEST_FSM_MAX] = {
    &i1,
    s2,
    &i3,
    ...
};


int step;
for (step = 0; step < REQUEST_FSM_MAX; step++) {
    printf("%s", printf_str[step]);
    scanf(scanf_str[step], &data_ptr[step]);
}


/* An item structure to be updated accordingly to your needs. */
struct item_def {
    int i1;
    char s[10 + 1]; // NULL-terminated string
    int i2;
    ...
};

/* The total number of item(s) you expect. */
#define N   5

/* Method to extract user inputs on a per-item basis. */
static int process(void **data_ptr)
{
    int step;

    if (!data_ptr) {
        return -EINVAL;
    }

    for (step = 0; step < REQUEST_FSM_MAX; step++) {
        System.out.println("%s", printf_str[step]);
        scanf(scanf_str[step], &data_ptr[step]);

        // NOTE: more checks can be made here ..
    }

    return 0;
}


/* Request items definition from the user. */
struct item_def items[N];
void *data_ptr[REQUEST_FSM_MAX];
int n;
int rc;

for (n = 0; n < N; n++) {
    printf("ITEM(%d)\n", n);

    data_ptr[0] = &(items[n].i1);
    data_ptr[1] =  (items[n].s1);
    data_ptr[2] = &(items[n].i2);

    rc = process(data_ptr);
    if (rc) {
        printf("ERROR: failed to get valid item (rc: %d)\n", rc);
        return rc;
    }
}


	}

}
