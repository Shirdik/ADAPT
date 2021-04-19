/* eslint-disable prettier/prettier */
// craco.config.js
module.exports = {
    style: {
        postcss: {
            plugins: [require("tailwindcss"), require("autoprefixer")],
        },
    },
};