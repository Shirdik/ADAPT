module.exports = {
  purge: ["./src/**/*.{js,jsx,ts,tsx}", "./public/index.html"],
  darkMode: false, // or 'media' or 'class'
  theme: {
    newmorphismColor: {
      red: {
        100: "#FBEBE9",
        200: "#F5CEC7",
      },
    },
    // colors: {
    //   morph: "#f1f3f6",
    // },
    extend: {},
  },
  variants: {
    extend: {
      backgroundColor: ["active", "focus"],
      lineClamp: ["hover"],
    },
  },
  plugins: [
    require("@tailwindcss/line-clamp"),
    require("@tailwindcss/forms"),
    require("tailwindcss-neumorphism"),
    require("@tailwindcss/aspect-ratio"),
  ],
};
