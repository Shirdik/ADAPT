const form = document.querySelector('#tweetForm');
const list = document.querySelector('#tweetList');

function addTweet(user, tweet) {
    const ele = document.createElement('li');
    const bold = document.createElement('b');
    bold.append(user);
    ele.append(bold);
    ele.append(`- ${tweet}`);
    list.append(ele);
}
form.addEventListener('submit', function(e) {
    e.preventDefault();
    const user = this.elements.username;
    const tweet = this.elements.tweet;
    addTweet(user.value, tweet.value);
});