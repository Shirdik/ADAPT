import React, { Component } from "react";
import dealsService from "./dealsService";
import UserItem from "./../components/common/userItem";

class ItemListService extends Component {
  state = {
    title: "",
    rewards: 0,
  };

  componentDidMount() {
    dealsService
      .getDeal(this.props.deal)
      .then(({ data }) => {
        const title = data.title;
        const rewards = data.rewards;
        this.setState({ title, rewards });
      })
      .catch(() => {
        const title = "";
        const rewards = 0;
        this.setState({ title, rewards });
      });
  }
  render() {
    return (
      <React.Fragement>
        <div>
          console.log(this.state)
          <UserItem
            title={this.state.title}
            rewards={this.state.rewards}
            sign={this.props.sign}
            color={this.props.color}
          />
        </div>
      </React.Fragement>
    );
  }
}

export default ItemListService;
